/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.patient;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ClientReachabilityRequestTest extends SerializationDeserializationTest {

    @Test
    public void testPatientReachabilityRequest() throws Exception {
        test("mocks/client_backend_patient_reachability_request.json", PatientReachabilityRequest.class);
    }

}