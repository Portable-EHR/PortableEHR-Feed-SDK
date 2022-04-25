/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.flipkart.zjsonpatch.JsonDiff;
import com.portableehr.network.client.request.privateMessage.PrivateMessageNotificationParameters;
import com.portableehr.network.client.request.privateMessage.PrivateMessageNotificationParametersDeserializer;
import com.portableehr.network.server.request.appointment.AppointmentPullParameters;
import com.portableehr.network.server.request.appointment.AppointmentPullParametersDeserializer;
import com.portableehr.network.server.request.client.ClientPullParameters;
import com.portableehr.network.server.request.client.ClientPullParametersDeserializer;
import com.portableehr.network.server.request.staff.StaffPullParameters;
import com.portableehr.network.server.request.staff.StaffPullParametersDeserializer;
import com.portableehr.network.server.response.appointment.AppointmentPullResponse;
import com.portableehr.network.server.response.appointment.AppointmentPullResponseDeserializer;
import com.portableehr.network.server.response.client.ClientPullResponse;
import com.portableehr.network.server.response.client.ClientPullResponseDeserializer;
import com.portableehr.network.server.response.staff.StaffPullResponse;
import com.portableehr.network.server.response.staff.StaffPullResponseDeserializer;
import org.junit.Before;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        objectMapper.configure(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//    objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        SimpleModule module = new SimpleModule();
        module.addDeserializer(ClientPullParameters.class, new ClientPullParametersDeserializer());
        module.addDeserializer(ClientPullResponse.class, new ClientPullResponseDeserializer());

        module.addDeserializer(StaffPullParameters.class, new StaffPullParametersDeserializer());
        module.addDeserializer(StaffPullResponse.class, new StaffPullResponseDeserializer());

        module.addDeserializer(AppointmentPullParameters.class, new AppointmentPullParametersDeserializer());
        module.addDeserializer(AppointmentPullResponse.class, new AppointmentPullResponseDeserializer());

        module.addDeserializer(PrivateMessageNotificationParameters.class, new PrivateMessageNotificationParametersDeserializer());

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        objectMapper.setDateFormat(df);

        objectMapper.registerModule(module);
    }

    protected <T> void test(String src, Class<T> clazz) throws java.io.IOException {
        // Deserialize file
        JsonNode expectedNode = objectMapper.readTree(this.getClass().getClassLoader().getResourceAsStream(src));
        T object = objectMapper.readValue(this.getClass().getClassLoader().getResourceAsStream(src), clazz);

        // Serialize object
        String json = objectMapper.writeValueAsString(object);

        // Deserialize object
        T objectResult = objectMapper.readValue(json, clazz);
        JsonNode actualNode = objectMapper.readTree(json);

        // Compare objects
        Map<String, Object> options = new HashMap<>();
        options.put(IGNORE_CUSTOM_EQUALS, true);
        assertTrue(deepEquals(object, objectResult));

        // Compare jsons
        JsonNode endedUpWith = JsonDiff.asJson(actualNode, expectedNode);
        if(!endedUpWith.isEmpty()){
            System.out.println("Differences in jsons : " + endedUpWith.toPrettyString());
        }
        assertTrue(endedUpWith.isEmpty());
    }
}
