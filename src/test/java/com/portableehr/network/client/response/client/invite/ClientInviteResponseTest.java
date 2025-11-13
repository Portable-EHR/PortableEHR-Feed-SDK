/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.client.invite;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ClientInviteResponseTest extends SerializationDeserializationTest {

    @Test
    public void testClientInviteResponse() throws Exception {
        test("mocks/client_backend_client_invite_response.json", ClientInviteResponse.class);
        test("mocks/client_backend_client_invite_qrcode_response.json", ClientInviteResponse.class);
    }

}