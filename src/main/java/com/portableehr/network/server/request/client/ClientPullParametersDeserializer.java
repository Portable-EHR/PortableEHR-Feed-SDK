/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.client;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

/**
 * Jackson deserializer to choose between {@link ClientPullSingleParameters} and {@link ClientPullBundleParameters}
 */
public class ClientPullParametersDeserializer extends JsonDeserializer<ClientPullParameters> {
    @Override
    public ClientPullParameters deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        ClientPullParameters parameters;
        JsonNode parametersJson = jsonParser.readValueAsTree();
        JsonParser parametersParser = parametersJson.traverse();
        parametersParser.nextToken();
        if(parametersJson.findValue("feedItemId") != null){
            parameters = deserializationContext.readValue(parametersParser, ClientPullSingleParameters.class);
        } else{
            parameters = deserializationContext.readValue(parametersParser, ClientPullBundleParameters.class);
        }

        return parameters;
    }
}
