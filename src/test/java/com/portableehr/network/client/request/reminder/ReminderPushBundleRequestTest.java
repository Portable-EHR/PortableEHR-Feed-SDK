package com.portableehr.network.client.request.reminder;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ReminderPushBundleRequestTest extends SerializationDeserializationTest {

    @Test
    public void testReminderPushBundleRequest() throws Exception {
        test("mocks/client_backend_reminder_request.json", ReminderPushBundleRequest.class);
    }

}