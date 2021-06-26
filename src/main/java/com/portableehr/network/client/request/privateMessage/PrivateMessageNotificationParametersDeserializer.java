/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.privateMessage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

/**
 * Jackson deserializer to choose between {@link PrivateMessageNotificationParametersWithPhysicianId} and {@link PrivateMessageNotificationParametersWithAuthor}
 */
public class PrivateMessageNotificationParametersDeserializer extends JsonDeserializer<PrivateMessageNotificationParameters> {

    @Override
    public PrivateMessageNotificationParameters deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        PrivateMessageNotificationParameters privateMessageNotificationParameters = null;

        while (!jsonParser.isClosed()){
            JsonToken jsonToken = jsonParser.nextToken();

            if(JsonToken.FIELD_NAME.equals(jsonToken)){
                JsonNode parametersJson = jsonParser.readValueAsTree();
                JsonParser responseParser = parametersJson.traverse();
                responseParser.nextToken();
                if(parametersJson.findValue("physicianId") != null){
                    privateMessageNotificationParameters = deserializationContext.readValue(responseParser, PrivateMessageNotificationParametersWithPhysicianId.class);
                } else{
                    privateMessageNotificationParameters = deserializationContext.readValue(responseParser, PrivateMessageNotificationParametersWithAuthor.class);
                }
            }
        }

        return privateMessageNotificationParameters;
    }
}
