/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.appointment;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class AppointmentPullResponseTest extends SerializationDeserializationTest {

    @Test
    public void testAppointmentPullSingleResponse() throws Exception {
        test("mocks/server_feed_appointment_pullSingle_response.json", AppointmentPullResponse.class);
    }

    @Test
    public void testAppointmentPullBundleResponse() throws Exception {
        test("mocks/server_feed_appointment_pullBundle_response.json", AppointmentPullResponse.class);
    }

}