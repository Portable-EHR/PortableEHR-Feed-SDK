/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.privateMessage;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class PrivateMessageContentResponseTest extends SerializationDeserializationTest {

    @Test
    public void testPrivateMessageContentResponse() throws Exception {
        test("mocks/server_feed_privateMessage_content_response.json", PrivateMessageContentResponse.class);
    }

}