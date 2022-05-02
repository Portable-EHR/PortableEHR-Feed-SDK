/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.convo.ParticipantTypeEnum;
import com.portableehr.model.convo.Conversation;
import com.portableehr.model.convo.ConversationEnvelop;
import com.portableehr.network.server.request.FeedHubRequestParameters;

import java.util.UUID;

/**
 * The parameters for the {@link ConvoPullSingleRequest}
 * <pre><code>
 * {
 *     "conversationId": "00000000-0000-0000-0000-000000000000",
 *     "includeEntries": true, // true -> a  {@link Conversation} must be returned, false -> {@link ConversationEnvelop}
 *     "participantType" : {@link ParticipantTypeEnum}, // Only used when includeEntries = true. To filter the returned entries to only display what the participant can see
 *     "participantId": "00000000-0000-0000-0000-000000000000" // Only used when includeEntries = true. To filter the returned entries to only display what the participant can see
 *     "maxEntries": 50, // Only used when includeEntries = true. How many entries to return, starting from the newest
 *     "offset": 0 // Only used when includeEntries = true. To get older entries, get the next "maxEntries" entries
 * }
 * </code></pre>
 */
public class ConvoPullSingleParameters extends FeedHubRequestParameters {

    @JsonProperty("conversationId")
    private UUID conversationId = null;

    @JsonProperty("includeEntries")
    private boolean includeEntries = false;

    @JsonProperty("participantType")
    private ParticipantTypeEnum participantType = null;

    @JsonProperty("participantId")
    private UUID participantId = null;

    @JsonProperty("offset")
    private Integer offset;

    @JsonProperty("maxEntries")
    private Integer maxEntries;

    public ConvoPullSingleParameters() {
    }

    public ConvoPullSingleParameters(UUID conversationId, boolean includeEntries, ParticipantTypeEnum participantType, UUID participantId, int offset, int maxEntries) {
        this.conversationId = conversationId;
        this.includeEntries = includeEntries;
        this.participantType = participantType;
        this.participantId = participantId;
        this.offset = offset;
        this.maxEntries = maxEntries;
    }

    public ConvoPullSingleParameters(UUID conversationId, boolean includeEntries) {
        this.conversationId = conversationId;
        this.includeEntries = includeEntries;
    }

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
