package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.time.LocalDate;
import java.util.Date;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, defaultImpl = EntryPayloadMessage.class)
@JsonSubTypes( {
        @JsonSubTypes.Type(EntryPayloadMessage.class),
        @JsonSubTypes.Type(EntryPayloadMove.class),
        @JsonSubTypes.Type(EntryPayloadParticipant.class),
        @JsonSubTypes.Type(EntryPayloadStatusChange.class),
        @JsonSubTypes.Type(EntryPayloadShare.class),
        @JsonSubTypes.Type(EntryPayloadAnnouncement.class),
})
public abstract class EntryPayload {
    private String freeTextReply = null;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateReply = null;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date dateTimeReply = null;
    private ChoiceOption choiceReply = null;

    public EntryPayload() {
    }

    public EntryPayload(String freeTextReply, LocalDate dateReply, Date dateTimeReply, ChoiceOption choiceReply) {
        this.freeTextReply = freeTextReply;
        this.dateReply = dateReply;
        this.dateTimeReply = dateTimeReply;
        this.choiceReply = choiceReply;
    }

    public String getFreeTextReply() {
        return freeTextReply;
    }

    public void setFreeTextReply(String freeTextReply) {
        this.freeTextReply = freeTextReply;
    }

    public LocalDate getDateReply() {
        return dateReply;
    }

    public void setDateReply(LocalDate dateReply) {
        this.dateReply = dateReply;
    }

    public Date getDateTimeReply() {
        return dateTimeReply;
    }

    public void setDateTimeReply(Date dateTimeReply) {
        this.dateTimeReply = dateTimeReply;
    }

    public ChoiceOption getChoiceReply() {
        return choiceReply;
    }

    public void setChoiceReply(ChoiceOption choiceReply) {
        this.choiceReply = choiceReply;
    }
}
