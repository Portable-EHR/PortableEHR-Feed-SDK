/*
 * Copyright © Portable EHR inc, 2024
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.client;

import com.portableehr.network.SerializationDeserializationTest;
import com.portableehr.network.client.response.client.invite.ClientInviteResponse;
import org.junit.Test;

public class ClientPushSingleResponseTest extends SerializationDeserializationTest {

    @Test
    public void testClientPushSingleResponse() throws Exception {
        test("mocks/client_backend_client_pushSingle_response.json", ClientPushSingleResponse.class);
    }

    @Test
    public void testClientPushSingleErrorResponse() throws Exception {
        test("mocks/client_backend_client_pushSingle_response_error.json", ClientPushSingleResponse.class);
    }

}