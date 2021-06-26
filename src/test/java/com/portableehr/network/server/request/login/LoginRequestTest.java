/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.login;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class LoginRequestTest extends SerializationDeserializationTest {

    @Test
    public void testServerLoginRequest() throws Exception {
        test("mocks/server_login_request.json", LoginRequest.class);
    }

}