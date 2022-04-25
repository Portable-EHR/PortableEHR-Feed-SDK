/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.appointment;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class AppointmentDispositionResponseTest extends SerializationDeserializationTest {

    @Test
    public void testAppointmentDispositionResponse() throws Exception {
        test("mocks/server_feed_appointment_disposition_response.json", AppointmentDispositionResponse.class);
    }

}