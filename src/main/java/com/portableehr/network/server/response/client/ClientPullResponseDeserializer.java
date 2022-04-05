/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.client;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.portableehr.network.ApiStatus;

import java.io.IOException;

/**
 * Jackson deserializer to choose between {@link ClientPullSingleResponseContent} and {@link ClientPullBundleResponseContent}
 */
public class ClientPullResponseDeserializer extends JsonDeserializer<ClientPullResponse> {

    @Override
    public ClientPullResponse deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        ClientPullResponse clientPullResponse = new ClientPullResponse();
        ApiStatus apiStatus = null;
        ClientPullResponseContent clientPullResponseContent = null;

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
                        clientPullResponseContent = deserializationContext.readValue(responseParser, ClientPullSingleResponseContent.class);
                    } else {
                        clientPullResponseContent = deserializationContext.readValue(responseParser, ClientPullBundleResponseContent.class);
                    }
                }

            }
        }

        clientPullResponse.setRequestStatus(apiStatus);
        clientPullResponse.setResponseContent(clientPullResponseContent);
        return clientPullResponse;
    }
}
