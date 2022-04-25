/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.client;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ClientReachabilityRequestTest extends SerializationDeserializationTest {

    @Test
    public void testClientReachabilityRequest() throws Exception {
        test("mocks/client_backend_client_reachability_request.json", ClientReachabilityRequest.class);
    }

}