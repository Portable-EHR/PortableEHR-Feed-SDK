package com.portableehr.network.server.response.convo;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ConvoPullSingleResponseTest extends SerializationDeserializationTest {

    @Test
    public void testConvoPullSingleFullResponse() throws Exception {
        test("mocks/server_feed_convo_pullSingle_full_response.json", ConvoPullSingleResponse.class);
    }

    @Test
    public void testConvoPullSingleEnvelopResponse() throws Exception {
        test("mocks/server_feed_convo_pullSingle_envelop_response.json", ConvoPullSingleResponse.class);
    }
}