/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.login;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class LoginRequestTest extends SerializationDeserializationTest {

    @Test
    public void testLoginRequest() throws Exception {
        test("mocks/client_login_request.json", LoginRequest.class);
    }

}