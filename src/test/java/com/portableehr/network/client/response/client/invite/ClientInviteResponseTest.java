/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.client.invite;

import com.portableehr.network.SerializationDeserializationTest;
import com.portableehr.network.client.request.client.invite.ClientInviteRequest;
import com.portableehr.network.client.response.client.reachability.ClientReachabilityResponse;
import org.junit.Test;

public class ClientInviteResponseTest extends SerializationDeserializationTest {

    @Test
    public void testClientInviteResponse() throws Exception {
        test("mocks/client_backend_client_invite_response.json", ClientInviteResponse.class);
    }

}