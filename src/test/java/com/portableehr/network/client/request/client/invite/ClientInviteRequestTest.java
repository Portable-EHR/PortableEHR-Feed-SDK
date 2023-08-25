/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.client.invite;

import com.portableehr.network.SerializationDeserializationTest;
import com.portableehr.network.client.request.client.reachability.ClientReachabilityRequest;
import org.junit.Test;

public class ClientInviteRequestTest extends SerializationDeserializationTest {

    @Test
    public void testClientInviteRequest() throws Exception {
        test("mocks/client_backend_client_invite_request.json", ClientInviteRequest.class);
    }

}