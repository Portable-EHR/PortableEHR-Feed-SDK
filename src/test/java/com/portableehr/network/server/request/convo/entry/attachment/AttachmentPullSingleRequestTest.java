package com.portableehr.network.server.request.convo.entry.attachment;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class AttachmentPullSingleRequestTest extends SerializationDeserializationTest {

    @Test
    public void testAttachmentPullSingleRequest() throws Exception {
        test("mocks/server_feed_convo_entry_attachment_pullSingle_request.json", AttachmentPullSingleRequest.class);
    }

}