package com.portableehr.model.convo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Conversation extends ConversationEnvelop {

    private List<Entry> entries = new ArrayList<>();
    private List<Participant> participants = new ArrayList<>();

    public Conversation(){
        super();
    }

    public Conversation(List<Entry> entries, List<Participant> participants) {
        super();
        this.entries = entries;
        this.participants = participants;
    }

    public Conversation(UUID id, ConversationStatusEnum status, String location, String staffTittle, String clientTittle, Date createdOn, Date updatedOn,
                        List<Entry> entries, List<Participant> participants) {
        super(id, status, location, staffTittle, clientTittle, createdOn, updatedOn);
        this.entries = entries;
        this.participants = participants;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}
