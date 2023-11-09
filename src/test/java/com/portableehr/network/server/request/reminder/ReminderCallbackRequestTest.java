/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.reminder;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ReminderCallbackRequestTest extends SerializationDeserializationTest {

    @Test
    public void testReminderCallbackRequest() throws Exception {
        test("mocks/server_feed_reminder_callback_request.json", ReminderCallbackRequest.class);
    }

}