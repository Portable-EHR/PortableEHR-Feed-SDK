package com.portableehr.network.server.request.convo.entry;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class EntryPushSingleRequestTest extends SerializationDeserializationTest {

    @Test
    public void testEntryPushSingleRequest() throws Exception {
        test("mocks/server_feed_convo_entry_pushSingle_request.json", EntryPushSingleRequest.class);
    }

}