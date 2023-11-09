/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo.entry.attachment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.convo.ParticipantTypeEnum;

import java.util.UUID;

/**
 * The parameters for the {@link AttachmentPullSingleRequest}
 * <pre><code>
 * {
 *     "conversationId": "00000000-0000-0000-0000-000000000000",
 *     "entryId": "00000000-0000-0000-0000-000000000000",
 *     "attachmentId": "00000000-0000-0000-0000-000000000000",
 *     "participantId": "00000000-0000-0000-0000-000000000000" // Only used when includeEntries = true. To filter the returned entries to only display what the participant can see
 *     "participantType" : {@link ParticipantTypeEnum}, // Only used when includeEntries = true. To filter the returned entries to only display what the participant can see
 * }
 * </code></pre>
 */
public class AttachmentPullSingleParameters {

    @JsonProperty("conversationId")
    private UUID conversationId = null;

    @JsonProperty("entryId")
    private UUID entryId = null;

    @JsonProperty("attachmentId")
    private UUID attachmentId = null;

    @JsonProperty("participantType")
    private ParticipantTypeEnum participantType = null;

    @JsonProperty("participantId")
    private UUID participantId = null;

    public AttachmentPullSingleParameters() {
    }

    public AttachmentPullSingleParameters(UUID conversationId, UUID entryId, UUID attachmentId, ParticipantTypeEnum participantType, UUID participantId) {
        this.conversationId = conversationId;
        this.entryId = entryId;
        this.attachmentId = attachmentId;
        this.participantType = participantType;
        this.participantId = participantId;
    }

    public UUID getConversationId() {
        return conversationId;
    }

    public void setConversationId(UUID conversationId) {
        this.conversationId = conversationId;
    }

    public UUID getEntryId() {
        return entryId;
    }

    public void setEntryId(UUID entryId) {
        this.entryId = entryId;
    }

    public UUID getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(UUID attachmentId) {
        this.attachmentId = attachmentId;
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
}
