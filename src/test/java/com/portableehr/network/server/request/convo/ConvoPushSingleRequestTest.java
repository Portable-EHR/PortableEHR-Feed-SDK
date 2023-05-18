package com.portableehr.network.server.request.convo;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ConvoPushSingleRequestTest extends SerializationDeserializationTest {

    @Test
    public void testConvoPushSingleRequest() throws Exception {
        test("mocks/server_feed_convo_pushSingle_request.json", ConvoPushSingleRequest.class);
    }

    @Test
    public void testConvoPushSingleNoContentRequest() throws Exception {
        test("mocks/server_feed_convo_pushSingle_request_no_content.json", ConvoPushSingleRequest.class);
    }

}