package com.portableehr.network.server.response.convo.entry.status;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class EntryStatusPushBundleResponseTest extends SerializationDeserializationTest {

    @Test
    public void testEntryStatusPushBundleResponse() throws Exception {
        test("mocks/server_feed_convo_entry_status_pushBundle_response.json", EntryStatusPushBundleResponse.class);
    }

}