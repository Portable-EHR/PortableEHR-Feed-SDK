/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo.entry.status;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.convo.EntryParticipantStatus;

import java.util.List;
import java.util.UUID;

/**
 * The parameters for the {@link EntryStatusPushSingleRequest}
 * <pre><code>
 * {
 *     "conversationId": "00000000-0000-0000-0000-000000000000",
 *     "status":[{@link EntryParticipantStatus}...], // A list of EntryParticipantStatus to update
 * }
 * </code></pre>
 */
public class EntryStatusPushSingleParameters {

    @JsonProperty("conversationId")
    private UUID conversationId = null;

    @JsonProperty("status")
    private List<EntryParticipantStatus> status = null;


    public EntryStatusPushSingleParameters() {
    }

    public EntryStatusPushSingleParameters(UUID conversationId, List<EntryParticipantStatus> status) {
        this.conversationId = conversationId;
        this.status = status;
    }

    public UUID getConversationId() {
        return conversationId;
    }

    public void setConversationId(UUID conversationId) {
        this.conversationId = conversationId;
    }

    public List<EntryParticipantStatus> getStatus() {
        return status;
    }

    public void setStatus(List<EntryParticipantStatus> status) {
        this.status = status;
    }
}
