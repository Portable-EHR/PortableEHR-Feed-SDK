package com.portableehr.network.server.request.convo.entry;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class EntryPushSingleRequestTest extends SerializationDeserializationTest {

    @Test
    public void testEntryPushSingleNewRequest() throws Exception {
        test("mocks/server_feed_convo_entry_pushSingle_new_request.json", EntryPushSingleRequest.class);
    }

    @Test
    public void testEntryPushSingleAddRequest() throws Exception {
        test("mocks/server_feed_convo_entry_pushSingle_add_request.json", EntryPushSingleRequest.class);
    }

}