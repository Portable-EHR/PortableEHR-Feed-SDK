package com.portableehr.model.convo;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Entry extends EntryEnvelop {
    private EntryPayload payload;

    public Entry() {
        super();
    }

    public Entry(UUID id, UUID from, List<EntryParticipantStatus> statusList, EntryTypeEnum type, EntryAudienceEnum audience, int attachmentCount, Date createdOn, EntryPayload payload) {
        super(id, from, statusList, type, audience, attachmentCount, createdOn);
        this.payload = payload;
    }

    public EntryPayload getPayload() {
        return payload;
    }

    public void setPayload(EntryPayload payload) {
        this.payload = payload;
    }
}
