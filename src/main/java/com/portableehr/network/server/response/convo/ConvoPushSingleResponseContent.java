/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.convo;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.portableehr.model.convo.Conversation;
import com.portableehr.model.convo.ConversationEnvelop;
import com.portableehr.network.server.response.FeedApiResponseContent;

/**
 * The responseContent attribute for the {@link ConvoPushSingleResponse}
 * <pre><code>
 * Serializes as a {@link ConversationEnvelop}
 * </code></pre>
 */
public class ConvoPushSingleResponseContent extends FeedApiResponseContent {

    @JsonUnwrapped
    ConversationEnvelop conversation;

    public ConvoPushSingleResponseContent() {
    }

    public ConvoPushSingleResponseContent(ConversationEnvelop conversation) {
        this.conversation = conversation;
    }

    public ConversationEnvelop getConversation() {
        return conversation;
    }

    public void setConversation(ConversationEnvelop conversation) {
        this.conversation = conversation;
    }
}
