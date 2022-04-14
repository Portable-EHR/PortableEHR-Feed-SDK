package com.portableehr.network.server.response.convo.entry.attachment;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class AttachmentPullSingleResponseTest extends SerializationDeserializationTest {

    @Test
    public void testAttachmentPullSingleResponse() throws Exception {
        test("mocks/server_feed_convo_entry_attachment_pullSingle_response.json", AttachmentPullSingleResponse.class);
    }

}