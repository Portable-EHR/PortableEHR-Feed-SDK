package com.portableehr.model.convo;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Entry extends EntryEnvelop {
    private EntryPayload payload;
    private Boolean requiresAcknowledge;
    private List<ReplyTypeEnum> possibleRepliesTypes;
    private Entry repliesTo;
    private List<ChoiceOption> choiceReplyOptions;

    public Entry() {
        super();
    }

    public Entry(UUID id, UUID from, List<EntryParticipantStatus> statusList, EntryTypeEnum type, EntryAudienceEnum audience, int attachmentCount, Date createdOn,
                 List<MentionedParticipant> mentionedParticipants, EntryPayload payload, Boolean requiresAcknowledge, List<ReplyTypeEnum> possibleRepliesTypes, Entry repliesTo,
                 List<ChoiceOption> choiceReplyOptions) {
        super(id, from, statusList, type, audience, attachmentCount, createdOn, mentionedParticipants);
        this.payload = payload;
        this.requiresAcknowledge = requiresAcknowledge;
        this.possibleRepliesTypes = possibleRepliesTypes;
        this.repliesTo = repliesTo;
        this.choiceReplyOptions = choiceReplyOptions;
    }

    public EntryPayload getPayload() {
        return payload;
    }

    public void setPayload(EntryPayload payload) {
        this.payload = payload;
    }

    public Boolean getRequiresAcknowledge() {
        return requiresAcknowledge;
    }

    public void setRequiresAcknowledge(Boolean requiresAcknowledge) {
        this.requiresAcknowledge = requiresAcknowledge;
    }

    public List<ReplyTypeEnum> getPossibleRepliesTypes() {
        return possibleRepliesTypes;
    }

    public void setPossibleRepliesTypes(List<ReplyTypeEnum> possibleRepliesTypes) {
        this.possibleRepliesTypes = possibleRepliesTypes;
    }


    public Entry getRepliesTo() {
        return repliesTo;
    }

    public void setRepliesTo(Entry repliesTo) {
        this.repliesTo = repliesTo;
    }


    public List<ChoiceOption> getChoiceReplyOptions() {
        return choiceReplyOptions;
    }

    public void setChoiceReplyOptions(List<ChoiceOption> choiceReplyOptions) {
        this.choiceReplyOptions = choiceReplyOptions;
    }

}
