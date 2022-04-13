package com.portableehr.network.client.request.convo;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ConversationEntryNotificationRequestTest extends SerializationDeserializationTest {

    @Test
    public void testConversationEntryNotificationRequest() throws Exception {
        test("mocks/client_backend_convo_entry_notification_request.json", ConversationEntryNotificationRequest.class);
    }

}