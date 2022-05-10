package com.portableehr.model.convo;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Conversation extends ConversationEnvelop {

    private List<Entry> entries = null;

    public Conversation(){
        super();
    }

    public Conversation(List<Entry> entries) {
        super();
        this.entries = entries;
    }

    public Conversation(UUID id, ConversationStatusEnum status, String location, String staffTittle, String clientTittle, Date createdOn, Date updatedOn,
                        List<Entry> entries, List<Participant> participants) {
        super(id, status, location, staffTittle, clientTittle, participants, createdOn, updatedOn);
        this.entries = entries;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

}
