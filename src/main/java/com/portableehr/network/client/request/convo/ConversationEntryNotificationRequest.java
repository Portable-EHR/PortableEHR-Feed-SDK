/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.convo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.client.request.FeedBackendRequest;

/**
 * Request sent to FeedHub to notify about a new entry in a Conversation.
 * <pre><code>
 * {
 *      "feedAlias": "fiktivDP",
 *      "command": "pushSingle",
 *      "parameters": {@link ConversationEntryNotificationParameters}
 * }
 * </code></pre>
 */
public class ConversationEntryNotificationRequest extends FeedBackendRequest {

    @JsonProperty("parameters")
    private ConversationEntryNotificationParameters parameters = null;

    public ConversationEntryNotificationRequest() {}

    public ConversationEntryNotificationRequest(String feedAlias, RequestCommand command, ConversationEntryNotificationParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public ConversationEntryNotificationParameters getParameters() {
        return parameters;
    }

    public void setParameters(ConversationEntryNotificationParameters parameters) {
        this.parameters = parameters;
    }

}
