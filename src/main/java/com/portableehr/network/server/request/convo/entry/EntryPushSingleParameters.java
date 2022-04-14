/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo.entry;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.convo.Entry;
import com.portableehr.network.server.request.FeedHubRequestParameters;
import com.portableehr.network.server.request.convo.ConvoPushSingleRequest;

import java.util.UUID;

/**
 * The parameters for the {@link EntryPushSingleRequest}
 * <pre><code>
 * {
 *     "conversationId": "00000000-0000-0000-0000-000000000000",
 *     "entry": {@link Entry}, // The entry being added to the conversation
 * }
 * </code></pre>
 */
public class EntryPushSingleParameters extends FeedHubRequestParameters {

    @JsonProperty("conversationId")
    private UUID conversationId = null;

    @JsonProperty("entry")
    private Entry entry = null;


    public EntryPushSingleParameters() {
    }

    public EntryPushSingleParameters(UUID conversationId, Entry entry) {
        this.conversationId = conversationId;
        this.entry = entry;
    }

    public UUID getConversationId() {
        return conversationId;
    }

    public void setConversationId(UUID conversationId) {
        this.conversationId = conversationId;
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }
}
