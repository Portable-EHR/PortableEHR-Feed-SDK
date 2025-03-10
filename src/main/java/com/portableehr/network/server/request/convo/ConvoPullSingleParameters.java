/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.convo.ParticipantTypeEnum;
import com.portableehr.model.convo.Conversation;
import com.portableehr.model.convo.ConversationEnvelop;

import java.util.UUID;

/**
 * The parameters for the {@link ConvoPullSingleRequest}
 * <pre><code>
 * {
 *     "conversationId": "00000000-0000-0000-0000-000000000000",
 *     "includeEntries": true, // true -> a  {@link Conversation} must be returned, false -> {@link ConversationEnvelop}
 *     "participantType" : {@link ParticipantTypeEnum}, // Only used when includeEntries = true. To filter the returned entries to only display what the participant can see
 *     "participantId": "00000000-0000-0000-0000-000000000000" // Only used when includeEntries = true. To filter the returned entries to only display what the participant can see
 *     "representedBy": "00000000-0000-0000-0000-000000000000" // Optional. The id of the guardian representing the patient
 *     "maxEntries": 50, // Only used when includeEntries = true. How many entries to return, starting from the newest
 *     "offset": 0 // Only used when includeEntries = true. To get older entries, get the next "maxEntries" entries
 * }
 * </code></pre>
 */
public class ConvoPullSingleParameters {

    @JsonProperty("conversationId")
    private UUID conversationId = null;

    @JsonProperty("includeEntries")
    private boolean includeEntries = false;

    @JsonProperty("participantType")
    private ParticipantTypeEnum participantType = null;

    @JsonProperty("participantId")
    private UUID participantId = null;

    @JsonProperty("representedBy")
    private UUID representedBy;

    @JsonProperty("offset")
    private Integer offset;

    @JsonProperty("maxEntries")
    private Integer maxEntries;

    public UUID getConversationId() {
        return conversationId;
    }

    public void setConversationId(UUID conversationId) {
        this.conversationId = conversationId;
    }

    public boolean isIncludeEntries() {
        return includeEntries;
    }

    public void setIncludeEntries(boolean includeEntries) {
        this.includeEntries = includeEntries;
    }

    public ParticipantTypeEnum getParticipantType() {
        return participantType;
    }

    public void setParticipantType(ParticipantTypeEnum participantType) {
        this.participantType = participantType;
    }

    public UUID getParticipantId() {
        return participantId;
    }

    public void setParticipantId(UUID participantId) {
        this.participantId = participantId;
    }

    public UUID getRepresentedBy() {
        return representedBy;
    }

    public void setRepresentedBy(UUID representedBy) {
        this.representedBy = representedBy;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getMaxEntries() {
        return maxEntries;
    }

    public void setMaxEntries(Integer maxEntries) {
        this.maxEntries = maxEntries;
    }
}
