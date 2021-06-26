/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.login;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class LoginResponseTest extends SerializationDeserializationTest {

    @Test
    public void testLoginResponse() throws Exception {
        test("mocks/server_login_response.json", LoginResponse.class);
    }

}