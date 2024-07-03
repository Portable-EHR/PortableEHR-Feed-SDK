package com.portableehr.network.client.request.dispensary.settings;

import com.portableehr.network.SerializationDeserializationTest;
import org.junit.Test;

public class DispensarySettingsPullSingleRequestTest extends SerializationDeserializationTest {

    @Test
    public void testExternalMessagePushSingleRequest() throws Exception {
        test("mocks/client_backend_dispensary_settings_pullSingle_request.json", DispensarySettingsPullSingleRequest.class);
    }

}