/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.appointment;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

/**
 * Jackson deserializer to choose between {@link AppointmentPullSingleParameters} and {@link AppointmentPullBundleParameters}
 */
public class AppointmentPullParametersDeserializer extends JsonDeserializer<AppointmentPullParameters> {
    @Override
    public AppointmentPullParameters deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        AppointmentPullParameters parameters;
        JsonNode parametersJson = jsonParser.readValueAsTree();
        JsonParser parametersParser = parametersJson.traverse();
        parametersParser.nextToken();
        if(parametersJson.findValue("feedItemId") != null){
            parameters = deserializationContext.readValue(parametersParser, AppointmentPullSingleParameters.class);
        } else{
            parameters = deserializationContext.readValue(parametersParser, AppointmentPullBundleParameters.class);
        }

        return parameters;
    }
}
