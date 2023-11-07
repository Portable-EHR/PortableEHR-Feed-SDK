/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.convo;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.portableehr.model.convo.EntryEnvelop;

/**
 * The responseContent field for {@link ConversationEntryNotificationResponse}<br><br>
 * Serialized as a {@link EntryEnvelop}
 */
public class ConversationEntryNotificationResponseContent {

    @JsonUnwrapped
    private EntryEnvelop entry = null;

    public ConversationEntryNotificationResponseContent() {
    }

    public ConversationEntryNotificationResponseContent(EntryEnvelop entry) {
        this.entry = entry;
    }

    public EntryEnvelop getEntry() {
        return entry;
    }

    public void setEntry(EntryEnvelop entry) {
        this.entry = entry;
    }
}
