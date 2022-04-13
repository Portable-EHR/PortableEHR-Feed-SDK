/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.client;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ClientReachabilityRequestTest extends SerializationDeserializationTest {

    @Test
    public void testClientReachabilityRequest() throws Exception {
        test("mocks/server_feed_client_pehrReachability_request.json", ClientReachabilityRequest.class);
    }

}