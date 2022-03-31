/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.staff;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.portableehr.network.ApiStatus;

import java.io.IOException;

/**
 * Jackson deserializer to choose between {@link StaffPullSingleResponseContent} and {@link StaffPullBundleResponseContent}
 */
public class StaffPullResponseDeserializer extends JsonDeserializer<StaffPullResponse> {

    @Override
    public StaffPullResponse deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        StaffPullResponse staffPullResponse = new StaffPullResponse();
        ApiStatus apiStatus = null;
        StaffPullResponseContent patientPullResponseContent = null;

        while (!jsonParser.isClosed()) {
            JsonToken jsonToken = jsonParser.nextToken();

            if (JsonToken.FIELD_NAME.equals(jsonToken)) {
                String name = jsonParser.getCurrentName();
                jsonParser.nextToken();

                if ("requestStatus".equals(name)) {
                    JsonNode responseContentJson = jsonParser.readValueAsTree();
                    JsonParser responseParser = responseContentJson.traverse();
                    responseParser.nextToken();
                    apiStatus = deserializationContext.readValue(responseParser, ApiStatus.class);
                }

                if ("responseContent".equals(name)) {
                    JsonNode responseContentJson = jsonParser.readValueAsTree();
                    JsonParser responseParser = responseContentJson.traverse();
                    responseParser.nextToken();
                    if (responseContentJson.findValue("offset") == null) {
                        patientPullResponseContent = deserializationContext.readValue(responseParser, StaffPullSingleResponseContent.class);
                    } else {
                        patientPullResponseContent = deserializationContext.readValue(responseParser, StaffPullBundleResponseContent.class);
                    }
                }

            }
        }

        staffPullResponse.setRequestStatus(apiStatus);
        staffPullResponse.setResponseContent(patientPullResponseContent);
        return staffPullResponse;
    }
}
