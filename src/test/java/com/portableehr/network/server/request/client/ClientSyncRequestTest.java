package com.portableehr.network.server.request.client;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ClientSyncRequestTest extends SerializationDeserializationTest {

    @Test
    public void testClientReachabilityRequest() throws Exception {
        test("mocks/server_feed_client_sync_request.json", ClientSyncRequest.class);
    }

}