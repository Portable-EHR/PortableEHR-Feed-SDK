/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.patient;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

/**
 * Jackson deserializer to choose between {@link PatientPullSingleParameters} and {@link PatientPullBundleParameters}
 */
public class PatientPullParametersDeserializer extends JsonDeserializer<PatientPullParameters> {
    @Override
    public PatientPullParameters deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        PatientPullParameters parameters;
        JsonNode parametersJson = jsonParser.readValueAsTree();
        JsonParser parametersParser = parametersJson.traverse();
        parametersParser.nextToken();
        if(parametersJson.findValue("feedItemId") != null){
            parameters = deserializationContext.readValue(parametersParser, PatientPullSingleParameters.class);
        } else{
            parameters = deserializationContext.readValue(parametersParser, PatientPullBundleParameters.class);
        }

        return parameters;
    }
}
