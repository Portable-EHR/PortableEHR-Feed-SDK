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
 * The parameters to sent in the shared element pull single request.
 * <pre><code>
 * {
 *      "conversationId": "00000000-0000-0000-0000-000000000000",
 *      "elementId" : "00000000-0000-0000-0000-000000000000"
 * }
 * </code></pre>
 */
public class SharedElementPullSingleParameters extends FeedBackendRequestParameters {

    @JsonProperty("conversationId")
    private UUID conversationId = null;

    @JsonProperty("elementId")
    private UUID elementId = null;

    public SharedElementPullSingleParameters() {
    }

    public SharedElementPullSingleParameters(UUID conversationId, UUID elementId) {
        this.conversationId = conversationId;
        this.elementId = elementId;
    }

    public UUID getConversationId() {
        return conversationId;
    }

    public void setConversationId(UUID conversationId) {
        this.conversationId = conversationId;
    }

    public UUID getElementId() {
        return elementId;
    }

    public void setElementId(UUID elementId) {
        this.elementId = elementId;
    }
}
