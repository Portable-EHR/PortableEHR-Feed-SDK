package com.portableehr.network.client.request.dispensary.settings;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class DispensarySettingsPushSingleRequestTest extends SerializationDeserializationTest {

    @Test
    public void testExternalMessagePushSingleRequest() throws Exception {
        test("mocks/client_backend_dispensary_settings_pushSingle_request.json", DispensarySettingsPushSingleRequest.class);
    }

}