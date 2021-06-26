/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.appointment;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.portableehr.network.ApiStatus;

import java.io.IOException;

/**
 * Jackson deserializer to choose between {@link AppointmentPullSingleResponseContent} and {@link AppointmentPullBundleResponseContent}
 */
public class AppointmentPullResponseDeserializer extends JsonDeserializer<AppointmentPullResponse> {

    @Override
    public AppointmentPullResponse deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        AppointmentPullResponse appointmentPullResponse = new AppointmentPullResponse();
        ApiStatus apiStatus = null;
        AppointmentPullResponseContent appointmentPullResponseContent = null;

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
                        appointmentPullResponseContent = deserializationContext.readValue(responseParser, AppointmentPullSingleResponseContent.class);
                    } else {
                        appointmentPullResponseContent = deserializationContext.readValue(responseParser, AppointmentPullBundleResponseContent.class);
                    }
                }

            }
        }

        appointmentPullResponse.setRequestStatus(apiStatus);
        appointmentPullResponse.setResponseContent(appointmentPullResponseContent);
        return appointmentPullResponse;
    }
}
