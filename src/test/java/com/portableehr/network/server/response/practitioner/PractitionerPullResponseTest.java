/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.practitioner;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class PractitionerPullResponseTest extends SerializationDeserializationTest {

    @Test
    public void testPractitionerPullResponse() throws Exception {
        test("mocks/server_feed_practitioner_pullSingle_response.json", PractitionerPullResponse.class);
        test("mocks/server_feed_practitioner_pullBundle_response.json", PractitionerPullResponse.class);
    }

}