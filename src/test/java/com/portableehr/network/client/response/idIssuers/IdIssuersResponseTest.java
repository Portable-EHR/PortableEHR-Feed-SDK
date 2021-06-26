/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.idIssuers;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class IdIssuersResponseTest extends SerializationDeserializationTest {

    @Test
    public void testIdIssuersResponse() throws Exception {
        test("mocks/client_backend_idissuers_response.json", IdIssuersResponse.class);
    }

}