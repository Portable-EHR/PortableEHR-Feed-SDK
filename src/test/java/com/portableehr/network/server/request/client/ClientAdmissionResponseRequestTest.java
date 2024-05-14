/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.client;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ClientAdmissionResponseRequestTest extends SerializationDeserializationTest {

    @Test
    public void testClientAdmissionResponseRequest() throws Exception {
        test("mocks/server_feed_api_response_request.json", ClientAdmissionResponseRequest.class);
    }

}