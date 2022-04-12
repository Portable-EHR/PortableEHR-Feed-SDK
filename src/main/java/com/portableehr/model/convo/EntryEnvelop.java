package com.portableehr.model.convo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class EntryEnvelop {

    private UUID id;
    private UUID from;
    private List<EntryMemberStatus> statusList = new ArrayList<>();
    private EntryTypeEnum type;
    private EntryAudienceEnum audience;
    private int attachmentCount;
    private Date createdOn;

    public EntryEnvelop() {
    }

    public EntryEnvelop(UUID id, UUID from, List<EntryMemberStatus> statusList, EntryTypeEnum type, EntryAudienceEnum audience, int attachmentCount, Date createdOn) {
        this.id = id;
        this.from = from;
        this.statusList = statusList;
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

    public List<EntryMemberStatus> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<EntryMemberStatus> statusList) {
        this.statusList = statusList;
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

    public int getAttachmentCount() {
        return attachmentCount;
    }

    public void setAttachmentCount(int attachmentCount) {
        this.attachmentCount = attachmentCount;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
