/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.convo.entry;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.portableehr.model.convo.ConversationEnvelop;
import com.portableehr.model.convo.Entry;
import com.portableehr.network.server.response.FeedApiResponseContent;

/**
 * The responseContent attribute for the {@link EntryPushSingleResponse}
 * <pre><code>
 * Serializes as a {@link Entry}
 * </code></pre>
 */
public class EntryPushSingleResponseContent extends FeedApiResponseContent {

    @JsonUnwrapped
    Entry entry;

    public EntryPushSingleResponseContent() {
    }

    public EntryPushSingleResponseContent(Entry entry) {
        this.entry = entry;
    }

    public Entry getConversation() {
        return entry;
    }

    public void setConversation(Entry entry) {
        this.entry = entry;
    }
}
