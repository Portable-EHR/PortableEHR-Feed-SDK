/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.patient;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class ClientPullResponseTest extends SerializationDeserializationTest {

    @Test
    public void test() throws Exception {
        test("mocks/server_feed_client_pullSingle_response.json", PatientPullResponse.class);
        test("mocks/server_feed_client_pullBundle_response.json", PatientPullResponse.class);
    }

}