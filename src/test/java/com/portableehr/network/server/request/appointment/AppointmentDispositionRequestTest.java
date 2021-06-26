/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.appointment;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class AppointmentDispositionRequestTest extends SerializationDeserializationTest {

    @Test
    public void testAppointmentDispositionRequest() throws Exception {
        test("mocks/server_feed_appointment_disposition_request.json", AppointmentDispositionRequest.class);
    }

}