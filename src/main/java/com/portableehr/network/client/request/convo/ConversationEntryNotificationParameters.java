/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.convo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.convo.EntryEnvelop;
import com.portableehr.network.client.request.FeedBackendRequestParameters;

import java.util.UUID;

/**
 * The parameters to sent in the entry notification request.
 * <pre><code>
 * {
 *      "conversationId": "00000000-0000-0000-0000-000000000000",
 *      "entry" : {@link com.portableehr.model.convo.EntryEnvelop}
 * }
 * </code></pre>
 */
public class ConversationEntryNotificationParameters extends FeedBackendRequestParameters {

    @JsonProperty("conversationId")
    private UUID conversationId = null;

    @JsonProperty("entry")
    private EntryEnvelop entry = null;

    public ConversationEntryNotificationParameters() {
    }

    public ConversationEntryNotificationParameters(UUID conversationId, EntryEnvelop entry) {
        this.conversationId = conversationId;
        this.entry = entry;
    }

    public UUID getConversationId() {
        return conversationId;
    }

    public void setConversationId(UUID conversationId) {
        this.conversationId = conversationId;
    }

    public EntryEnvelop getEntry() {
        return entry;
    }

    public void setEntry(EntryEnvelop entry) {
        this.entry = entry;
    }
}
