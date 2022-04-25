/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.appointment;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class AppointmentPullRequestTest extends SerializationDeserializationTest {

    @Test
    public void testAppointmentPullSingleRequest() throws Exception {
        test("mocks/server_feed_appointment_pullSingle_request.json", AppointmentPullRequest.class);
    }
    @Test
    public void testAppointmentPullBundleRequest() throws Exception {
        test("mocks/server_feed_appointment_pullBundle_request.json", AppointmentPullRequest.class);
    }

}