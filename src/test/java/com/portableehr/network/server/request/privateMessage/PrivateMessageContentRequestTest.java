/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.privateMessage;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class PrivateMessageContentRequestTest extends SerializationDeserializationTest {

    @Test
    public void testPrivateMessageContentRequest() throws Exception {
        test("mocks/server_feed_privateMessage_content_request.json", PrivateMessageContentRequest.class);
    }

}