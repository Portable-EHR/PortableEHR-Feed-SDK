/*
 * Copyright © Portable EHR inc, 2024
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.client;

import com.portableehr.network.SerializationDeserializationTest;
import com.portableehr.network.client.request.client.invite.ClientInviteRequest;
import org.junit.Test;

public class ClientPushSingleRequestTest extends SerializationDeserializationTest {

    @Test
    public void testClientPushSingleRequest() throws Exception {
        test("mocks/client_backend_client_pushSingle_request.json", ClientPushSingleRequest.class);
    }

}