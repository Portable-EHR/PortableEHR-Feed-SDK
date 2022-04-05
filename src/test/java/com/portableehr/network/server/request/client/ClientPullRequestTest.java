/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.client;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ClientPullRequestTest extends SerializationDeserializationTest {

    @Test
    public void testPatientPullRequest() throws Exception {
        test("mocks/server_feed_client_pullSingle_request.json", ClientPullRequest.class);
        test("mocks/server_feed_client_pullBundle_request.json", ClientPullRequest.class);
    }

}