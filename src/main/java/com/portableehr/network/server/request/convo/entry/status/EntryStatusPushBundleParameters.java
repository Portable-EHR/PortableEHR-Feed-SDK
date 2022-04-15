/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo.entry.status;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.convo.EntryParticipantStatus;
import com.portableehr.network.server.request.FeedHubRequestParameters;

import java.util.List;
import java.util.UUID;

/**
 * The parameters for the {@link EntryStatusPushBundleRequest}
 * <pre><code>
 * {
 *     "conversationId": "00000000-0000-0000-0000-000000000000",
 *     "statuses":[{@link EntryParticipantStatus}...], // A list of EntryParticipantStatus to update
 * }
 * </code></pre>
 */
public class EntryStatusPushBundleParameters extends FeedHubRequestParameters {

    @JsonProperty("conversationId")
    private UUID conversationId = null;

    @JsonProperty("statuses")
    private List<EntryParticipantStatus> statuses = null;


    public EntryStatusPushBundleParameters() {
    }

    public EntryStatusPushBundleParameters(UUID conversationId, List<EntryParticipantStatus> statuses) {
        this.conversationId = conversationId;
        this.statuses = statuses;
    }

    public UUID getConversationId() {
        return conversationId;
    }

    public void setConversationId(UUID conversationId) {
        this.conversationId = conversationId;
    }

    public List<EntryParticipantStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<EntryParticipantStatus> statuses) {
        this.statuses = statuses;
    }
}
