/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.privateMessage;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class PrivateMessageStatusRequestTest extends SerializationDeserializationTest {

    @Test
    public void testPrivateMessageStatusRequest() throws Exception {
        test("mocks/server_feed_privateMessage_status_request.json", PrivateMessageStatusRequest.class);
    }

}