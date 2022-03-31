/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.staff;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class StaffPullRequestTest extends SerializationDeserializationTest {

    @Test
    public void testStaffPullRequest() throws Exception {
        test("mocks/server_feed_practitioner_pullSingle_request.json", StaffPullRequest.class);
        test("mocks/server_feed_practitioner_pullBundle_request.json", StaffPullRequest.class);
    }

}