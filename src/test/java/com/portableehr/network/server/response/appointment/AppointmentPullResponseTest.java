/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.appointment;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class AppointmentPullResponseTest extends SerializationDeserializationTest {

    @Test
    public void testAppointmentPullResponse() throws Exception {
        test("mocks/server_feed_appointment_pullSingle_request.json", AppointmentPullResponse.class);
        test("mocks/server_feed_appointment_pullBundle_request.json", AppointmentPullResponse.class);
    }

}