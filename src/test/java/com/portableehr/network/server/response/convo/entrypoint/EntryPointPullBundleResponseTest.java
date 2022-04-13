package com.portableehr.network.server.response.convo.entrypoint;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class EntryPointPullBundleResponseTest extends SerializationDeserializationTest {

    @Test
    public void testEntryPointPullBundleResponse() throws Exception {
        test("mocks/server_feed_convo_entrypoint_pullBundle_response.json", EntryPointPullBundleResponse.class);
    }

}