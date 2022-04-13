package com.portableehr.network.client.response.convo;

import com.portableehr.network.SerializationDeserializationTest;
import com.portableehr.network.client.request.convo.ConversationEntryNotificationRequest;
import org.junit.Test;

public class ConversationEntryNotificationResponseTest extends SerializationDeserializationTest {

    @Test
    public void testConversationEntryNotificationResponse() throws Exception {
        test("mocks/client_backend_convo_entry_notification_response.json", ConversationEntryNotificationRequest.class);
    }
}