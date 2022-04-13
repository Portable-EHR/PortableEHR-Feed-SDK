/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.convo.Conversation;
import com.portableehr.model.convo.ConversationEnvelop;
import com.portableehr.model.convo.Entry;
import com.portableehr.model.convo.ParticipantTypeEnum;
import com.portableehr.network.server.request.FeedHubRequestParameters;

import java.util.UUID;

/**
 * The parameters for the {@link ConvoPushSingleRequest}
 * <pre><code>
 * {
 *     "entry": {@link Entry}, // The first entry in the conversation
 *     "locationEntryPointId": true, // Where the new conversation is starting
 * }
 * </code></pre>
 */
public class ConvoPushSingleParameters extends FeedHubRequestParameters {

    @JsonProperty("entry")
    private Entry entry = null;

    @JsonProperty("locationEntryPointId")
    private UUID locationEntryPointId = null;


    public ConvoPushSingleParameters() {
    }

    public ConvoPushSingleParameters(Entry entry, UUID locationEntryPointId) {
        this.entry = entry;
        this.locationEntryPointId = locationEntryPointId;
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    public UUID getLocationEntryPointId() {
        return locationEntryPointId;
    }

    public void setLocationEntryPointId(UUID locationEntryPointId) {
        this.locationEntryPointId = locationEntryPointId;
    }
}
