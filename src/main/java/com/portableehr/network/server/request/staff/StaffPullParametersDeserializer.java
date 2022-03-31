/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.staff;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

/**
 * Jackson deserializer to choose between {@link StaffPullSingleParameters} and {@link StaffPullBundleParameters}
 */
public class StaffPullParametersDeserializer extends JsonDeserializer<StaffPullParameters> {
    @Override
    public StaffPullParameters deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        StaffPullParameters parameters;
        JsonNode parametersJson = jsonParser.readValueAsTree();
        JsonParser parametersParser = parametersJson.traverse();
        parametersParser.nextToken();
        if(parametersJson.findValue("feedItemId") != null){
            parameters = deserializationContext.readValue(parametersParser, StaffPullSingleParameters.class);
        } else{
            parameters = deserializationContext.readValue(parametersParser, StaffPullBundleParameters.class);
        }

        return parameters;
    }
}
