package com.portableehr.model.convo;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Entry extends EntryEnvelop {
    private List<EntryPayload> entries = new LinkedList<>();

    public Entry() {
        super();
    }

    public Entry(UUID id, UUID from, List<EntryMemberStatus> statusList, EntryTypeEnum type, EntryAudienceEnum audience, int attachmentCount, Date createdOn, List<EntryPayload> entries) {
        super(id, from, statusList, type, audience, attachmentCount, createdOn);
        this.entries = entries;
    }

    public List<EntryPayload> getEntries() {
        return entries;
    }

    public void setEntries(List<EntryPayload> entries) {
        this.entries = entries;
    }
}
