package com.portableehr.network.client.response.reminder;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ReminderPushBundleResponseTest extends SerializationDeserializationTest {
    @Test
    public void testReminderPushBundleResponse() throws Exception {
        test("mocks/client_backend_reminder_response.json", ReminderPushBundleResponse.class);
    }
}