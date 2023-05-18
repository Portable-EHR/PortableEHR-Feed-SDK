package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.portableehr.DateDeserializer;

import java.util.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, defaultImpl = EntryEnvelop.class)
@JsonSubTypes( {
        @JsonSubTypes.Type(Entry.class),
})
public class EntryEnvelop {

    private UUID id;
    private UUID from;
    private List<EntryParticipantStatus> status = null;
    private EntryTypeEnum type;
    private EntryAudienceEnum audience;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer attachmentCount;
    @JsonDeserialize(using = DateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date createdOn;

    public EntryEnvelop() {
    }

    public EntryEnvelop(UUID id, UUID from, List<EntryParticipantStatus> status, EntryTypeEnum type, EntryAudienceEnum audience, int attachmentCount, Date createdOn) {
        this.id = id;
        this.from = from;
        this.status = status;
        this.type = type;
        this.audience = audience;
        this.attachmentCount = attachmentCount;
        this.createdOn = createdOn;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getFrom() {
        return from;
    }

    public void setFrom(UUID from) {
        this.from = from;
    }

    public List<EntryParticipantStatus> getStatus() {
        return status;
    }

    public void setStatus(List<EntryParticipantStatus> status) {
        this.status = status;
    }

    public EntryTypeEnum getType() {
        return type;
    }

    public void setType(EntryTypeEnum type) {
        this.type = type;
    }

    public EntryAudienceEnum getAudience() {
        return audience;
    }

    public void setAudience(EntryAudienceEnum audience) {
        this.audience = audience;
    }

    public Integer getAttachmentCount() {
        return attachmentCount;
    }

    public void setAttachmentCount(Integer attachmentCount) {
        this.attachmentCount = attachmentCount;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
