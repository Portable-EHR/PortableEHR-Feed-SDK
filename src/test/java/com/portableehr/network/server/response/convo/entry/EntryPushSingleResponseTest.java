package com.portableehr.network.server.response.convo.entry;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class EntryPushSingleResponseTest extends SerializationDeserializationTest {

    @Test
    public void testEntryPushSingleResponse() throws Exception {
        test("mocks/server_feed_convo_entry_pushSingle_response.json", EntryPushSingleResponse.class);
    }

}