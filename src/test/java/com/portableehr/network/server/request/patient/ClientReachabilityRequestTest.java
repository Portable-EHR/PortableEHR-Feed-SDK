/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.patient;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ClientReachabilityRequestTest extends SerializationDeserializationTest {

    @Test
    public void testPatientReachabilityRequest() throws Exception {
        test("mocks/server_feed_patient_pehrReachability_request.json", PatientReachabilityRequest.class);
    }

}