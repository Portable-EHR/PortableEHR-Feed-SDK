/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.practitioner;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.server.response.appointment.AppointmentPullBundleResponseContent;
import com.portableehr.network.server.response.appointment.AppointmentPullSingleResponseContent;

import java.io.IOException;

/**
 * Jackson deserializer to choose between {@link PractitionerPullSingleResponseContent} and {@link PractitionerPullBundleResponseContent}
 */
public class PractitionerPullResponseDeserializer extends JsonDeserializer<PractitionerPullResponse> {

    @Override
    public PractitionerPullResponse deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        PractitionerPullResponse practitionerPullResponse = new PractitionerPullResponse();
        ApiStatus apiStatus = null;
        PractitionerPullResponseContent patientPullResponseContent = null;

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
                        patientPullResponseContent = deserializationContext.readValue(responseParser, PractitionerPullSingleResponseContent.class);
                    } else {
                        patientPullResponseContent = deserializationContext.readValue(responseParser, PractitionerPullBundleResponseContent.class);
                    }
                }

            }
        }

        practitionerPullResponse.setRequestStatus(apiStatus);
        practitionerPullResponse.setResponseContent(patientPullResponseContent);
        return practitionerPullResponse;
    }
}
