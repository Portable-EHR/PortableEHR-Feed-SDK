/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.externalMessage;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ExternalMessageUpdateRequestTest extends SerializationDeserializationTest {

    @Test
    public void testExternalMessageUpdateRequest() throws Exception {
        test("mocks/server_feed_externalMessage_update_request.json", ExternalMessageUpdateRequest.class);
    }

}