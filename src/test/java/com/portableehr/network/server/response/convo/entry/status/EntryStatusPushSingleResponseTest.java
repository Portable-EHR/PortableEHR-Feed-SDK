package com.portableehr.network.server.response.convo.entry.status;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class EntryStatusPushSingleResponseTest extends SerializationDeserializationTest {

    @Test
    public void testEntryStatusPushBundleResponse() throws Exception {
        test("mocks/server_feed_convo_entry_status_pushSingle_response.json", EntryStatusPushSingleResponse.class);
    }

}