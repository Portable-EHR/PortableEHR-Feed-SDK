package com.portableehr.network.client.request.externalMessage;

import com.portableehr.network.SerializationDeserializationTest;
import com.portableehr.network.client.request.reminder.ReminderPushBundleRequest;
import org.junit.Test;

public class ExternalMessagePushSingleRequestTest extends SerializationDeserializationTest {

    @Test
    public void testExternalMessagePushSingleRequest() throws Exception {
        test("mocks/client_backend_externalMessage_request.json", ExternalMessagePushSingleRequest.class);
    }

}