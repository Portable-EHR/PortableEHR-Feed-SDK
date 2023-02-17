package com.portableehr.network.client.request.convo;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class SharedElementPullSingleRequestTest extends SerializationDeserializationTest {

    @Test
    public void testConversationEntryNotificationRequest() throws Exception {
        test("mocks/client_backend_convo_entry_shared_request.json", SharedElementPullSingleRequest.class);
    }

}