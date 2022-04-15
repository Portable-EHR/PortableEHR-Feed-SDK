package com.portableehr.network.server.request.convo.entry.status;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class EntryStatusPushBundleRequestTest extends SerializationDeserializationTest {

    @Test
    public void testEntryStatusPushSingleRequest() throws Exception {
        test("mocks/server_feed_convo_entry_status_pushBundle_request.json", EntryStatusPushBundleRequest.class);
    }
}