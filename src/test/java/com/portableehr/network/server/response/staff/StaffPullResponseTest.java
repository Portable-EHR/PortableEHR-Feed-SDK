/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.staff;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class StaffPullResponseTest extends SerializationDeserializationTest {

    @Test
    public void testStaffPullSingleResponse() throws Exception {
        test("mocks/server_feed_staff_pullSingle_response.json", StaffPullResponse.class);
    }

    @Test
    public void testStaffPullBundleResponse() throws Exception {
        test("mocks/server_feed_staff_pullBundle_response.json", StaffPullResponse.class);
    }

}