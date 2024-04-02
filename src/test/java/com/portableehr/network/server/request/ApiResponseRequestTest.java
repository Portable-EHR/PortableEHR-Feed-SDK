/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request;

import com.portableehr.network.SerializationDeserializationTest;
import com.portableehr.network.server.request.ApiResponseRequest;
import org.junit.Test;

public class ApiResponseRequestTest extends SerializationDeserializationTest {

    @Test
    public void testExternalMessageUpdateRequest() throws Exception {
        test("mocks/server_feed_api_response_request.json", ApiResponseRequest.class);
    }

}