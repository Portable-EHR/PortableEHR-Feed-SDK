/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.patient;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ClientReachabilityResponseTest extends SerializationDeserializationTest {

    @Test
    public void testPatientReachabilityResponse() throws Exception {
        test("mocks/client_backend_patient_reachability_response.json", PatientReachabilityResponse.class);
    }

}