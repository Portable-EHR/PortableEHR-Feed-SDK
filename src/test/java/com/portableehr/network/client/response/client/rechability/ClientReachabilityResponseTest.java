/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.client.rechability;

import com.portableehr.network.SerializationDeserializationTest;
import com.portableehr.network.client.response.client.reachability.ClientReachabilityResponse;
import org.junit.Test;

public class ClientReachabilityResponseTest extends SerializationDeserializationTest {

    @Test
    public void testClientReachabilityResponse() throws Exception {
        test("mocks/client_backend_client_reachability_response.json", ClientReachabilityResponse.class);
    }

}