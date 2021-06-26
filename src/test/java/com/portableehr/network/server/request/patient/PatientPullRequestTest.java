/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.patient;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class PatientPullRequestTest extends SerializationDeserializationTest {

    @Test
    public void testPatientPullRequest() throws Exception {
        test("mocks/server_feed_patient_pullSingle_request.json", PatientPullRequest.class);
        test("mocks/server_feed_patient_pullBundle_request.json", PatientPullRequest.class);
    }

}