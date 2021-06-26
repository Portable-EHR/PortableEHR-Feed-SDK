/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.patient;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.portableehr.network.ApiStatus;

import java.io.IOException;

/**
 * Jackson deserializer to choose between {@link PatientPullSingleResponseContent} and {@link PatientPullBundleResponseContent}
 */
public class PatientPullResponseDeserializer extends JsonDeserializer<PatientPullResponse> {

    @Override
    public PatientPullResponse deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        PatientPullResponse patientPullResponse = new PatientPullResponse();
        ApiStatus apiStatus = null;
        PatientPullResponseContent patientPullResponseContent = null;

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
                        patientPullResponseContent = deserializationContext.readValue(responseParser, PatientPullSingleResponseContent.class);
                    } else {
                        patientPullResponseContent = deserializationContext.readValue(responseParser, PatientPullBundleResponseContent.class);
                    }
                }

            }
        }

        patientPullResponse.setRequestStatus(apiStatus);
        patientPullResponse.setResponseContent(patientPullResponseContent);
        return patientPullResponse;
    }
}
