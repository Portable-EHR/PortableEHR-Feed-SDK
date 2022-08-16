package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.portableehr.DateDeserializer;

import java.util.Date;
import java.util.UUID;

public class EntryParticipantStatus {

    private UUID participantId;
    private UUID entryId;
    private EntryParticipantStatusEnum status;
    @JsonDeserialize(using = DateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date date;

    public EntryParticipantStatus() {
    }

    public EntryParticipantStatus(UUID participantId, UUID entryId, EntryParticipantStatusEnum status, Date date) {
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

    public EntryParticipantStatusEnum getStatus() {
        return status;
    }

    public void setStatus(EntryParticipantStatusEnum status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
