package com.portableehr.model.convo;

import java.util.Date;

public class EntryPayloadStatusChange extends EntryPayload {

    private ConversationStatusEnum fromStatus;
    private ConversationStatusEnum toStatus;

    public EntryPayloadStatusChange() {
    }

    public EntryPayloadStatusChange(ConversationStatusEnum fromStatus, ConversationStatusEnum toStatus) {
        this.fromStatus = fromStatus;
        this.toStatus = toStatus;
    }

    public EntryPayloadStatusChange(String freeTextReply, Date dateReply, Date dateTimeReply, PossibleReply choiceReply, ConversationStatusEnum fromStatus,
                                    ConversationStatusEnum toStatus) {
        super(freeTextReply, dateReply, dateTimeReply, choiceReply);
        this.fromStatus = fromStatus;
        this.toStatus = toStatus;
    }

    public ConversationStatusEnum getFromStatus() {
        return fromStatus;
    }

    public void setFromStatus(ConversationStatusEnum fromStatus) {
        this.fromStatus = fromStatus;
    }

    public ConversationStatusEnum getToStatus() {
        return toStatus;
    }

    public void setToStatus(ConversationStatusEnum toStatus) {
        this.toStatus = toStatus;
    }
}
