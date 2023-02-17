package com.portableehr.network.client.response.convo;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class SharedElementPullSingleResponseTest extends SerializationDeserializationTest {

    @Test
    public void testConversationEntryNotificationResponse() throws Exception {
        test("mocks/client_backend_convo_entry_shared_response.json", SharedElementPullSingleResponse.class);
    }
}