/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.portableehr.network.client.request.privateMessage.PrivateMessageNotificationParameters;
import com.portableehr.network.client.request.privateMessage.PrivateMessageNotificationParametersDeserializer;
import com.portableehr.network.server.request.appointment.AppointmentPullParameters;
import com.portableehr.network.server.request.appointment.AppointmentPullParametersDeserializer;
import com.portableehr.network.server.request.patient.PatientPullParameters;
import com.portableehr.network.server.request.patient.PatientPullParametersDeserializer;
import com.portableehr.network.server.request.practitioner.PractitionerPullParameters;
import com.portableehr.network.server.request.practitioner.PractitionerPullParametersDeserializer;
import com.portableehr.network.server.response.appointment.AppointmentPullResponse;
import com.portableehr.network.server.response.appointment.AppointmentPullResponseDeserializer;
import com.portableehr.network.server.response.patient.PatientPullResponse;
import com.portableehr.network.server.response.patient.PatientPullResponseDeserializer;
import com.portableehr.network.server.response.practitioner.PractitionerPullResponse;
import com.portableehr.network.server.response.practitioner.PractitionerPullResponseDeserializer;
import org.junit.Before;

import java.util.HashMap;
import java.util.Map;

import static com.cedarsoftware.util.DeepEquals.IGNORE_CUSTOM_EQUALS;
import static com.cedarsoftware.util.DeepEquals.deepEquals;
import static org.junit.Assert.assertTrue;

public abstract class SerializationDeserializationTest {
    protected ObjectMapper objectMapper = null;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//    objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        SimpleModule module = new SimpleModule();
        module.addDeserializer(PatientPullParameters.class, new PatientPullParametersDeserializer());
        module.addDeserializer(PatientPullResponse.class, new PatientPullResponseDeserializer());

        module.addDeserializer(PractitionerPullParameters.class, new PractitionerPullParametersDeserializer());
        module.addDeserializer(PractitionerPullResponse.class, new PractitionerPullResponseDeserializer());

        module.addDeserializer(AppointmentPullParameters.class, new AppointmentPullParametersDeserializer());
        module.addDeserializer(AppointmentPullResponse.class, new AppointmentPullResponseDeserializer());

        module.addDeserializer(PrivateMessageNotificationParameters.class, new PrivateMessageNotificationParametersDeserializer());

        objectMapper.registerModule(module);
    }

    protected <T> void test(String src, Class<T> clazz) throws java.io.IOException {
        T object = objectMapper.readValue(this.getClass().getClassLoader().getResourceAsStream(src), clazz);
        String json = objectMapper.writeValueAsString(object);
        T objectResult = objectMapper.readValue(json, clazz);

        Map<String, Object> options = new HashMap<>();
        options.put(IGNORE_CUSTOM_EQUALS, true);
        assertTrue(deepEquals(object, objectResult));
    }
}
