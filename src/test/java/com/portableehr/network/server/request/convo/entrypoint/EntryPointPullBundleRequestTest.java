package com.portableehr.network.server.request.convo.entrypoint;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class EntryPointPullBundleRequestTest extends SerializationDeserializationTest {

    @Test
    public void testEntryPointPullBundleRequest() throws Exception {
        test("mocks/server_feed_convo_entrypoint_pullBundle_request.json", EntryPointPullBundleRequest.class);
    }

}