package com.portableehr.model.convo;

import java.util.Date;
import java.util.UUID;

public class EntryMemberStatus {

    private UUID participantId;
    private UUID entryId;
    private EntryMemberStatusEnum status;
    private Date date;

    public EntryMemberStatus() {
    }

    public EntryMemberStatus(UUID participantId, UUID entryId, EntryMemberStatusEnum status, Date date) {
        this.participantId = participantId;
        this.entryId = entryId;
        this.status = status;
        this.date = date;
    }

    public UUID getParticipantId() {
        return participantId;
    }

    public void setParticipantId(UUID participantId) {
        this.participantId = participantId;
    }

    public UUID getEntryId() {
        return entryId;
    }

    public void setEntryId(UUID entryId) {
        this.entryId = entryId;
    }

    public EntryMemberStatusEnum getStatus() {
        return status;
    }

    public void setStatus(EntryMemberStatusEnum status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
