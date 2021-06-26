/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.practitioner;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

/**
 * Jackson deserializer to choose between {@link PractitionerPullSingleParameters} and {@link PractitionerPullBundleParameters}
 */
public class PractitionerPullParametersDeserializer extends JsonDeserializer<PractitionerPullParameters> {
    @Override
    public PractitionerPullParameters deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        PractitionerPullParameters parameters;
        JsonNode parametersJson = jsonParser.readValueAsTree();
        JsonParser parametersParser = parametersJson.traverse();
        parametersParser.nextToken();
        if(parametersJson.findValue("feedItemId") != null){
            parameters = deserializationContext.readValue(parametersParser, PractitionerPullSingleParameters.class);
        } else{
            parameters = deserializationContext.readValue(parametersParser, PractitionerPullBundleParameters.class);
        }

        return parameters;
    }
}
