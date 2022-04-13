package com.portableehr.network.server.response.convo;

import com.portableehr.network.SerializationDeserializationTest;
import junit.framework.TestCase;
import org.junit.Test;

public class ConvoPushSingleResponseTest extends SerializationDeserializationTest {

    @Test
    public void testConvoPushSingleResponse() throws Exception {
        test("mocks/server_feed_convo_pushSingle_response.json", ConvoPushSingleResponse.class);
    }

}