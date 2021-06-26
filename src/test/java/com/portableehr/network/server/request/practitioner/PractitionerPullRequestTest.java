/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.practitioner;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class PractitionerPullRequestTest extends SerializationDeserializationTest {

    @Test
    public void testPractitionerPullRequest() throws Exception {
        test("mocks/server_feed_practitioner_pullSingle_request.json", PractitionerPullRequest.class);
        test("mocks/server_feed_practitioner_pullBundle_request.json", PractitionerPullRequest.class);
    }

}