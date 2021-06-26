/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.privateMessage;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class PrivateMessageNotificationRequestTest extends SerializationDeserializationTest {
    @Test
    public void testPrivateMessageNotificationRequest() throws Exception {
        test("mocks/client_backend_privateMessage_notification_author_request.json", PrivateMessageNotificationRequest.class);
        test("mocks/client_backend_privateMessage_notification_physicianId_request.json", PrivateMessageNotificationRequest.class);
    }

}