package com.portableehr.network.server.request.convo;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ConvoPullSingleRequestTest extends SerializationDeserializationTest {

    @Test
    public void testConvoPullSingleFullRequest() throws Exception {
        test("mocks/server_feed_convo_pullSingle_full_request.json", ConvoPullSingleRequest.class);
    }

    @Test
    public void testConvoPullSingleEnvelopRequest() throws Exception {
        test("mocks/server_feed_convo_pullSingle_envelop_request.json", ConvoPullSingleRequest.class);
    }
}