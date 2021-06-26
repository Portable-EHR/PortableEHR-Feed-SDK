/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.privateMessage;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class PrivateMessageStatusResponseTest extends SerializationDeserializationTest {

    @Test
    public void testPrivateMessageStatusResponse() throws Exception {
        test("mocks/server_feed_privateMessage_status_response.json", PrivateMessageStatusResponse.class);
    }

}