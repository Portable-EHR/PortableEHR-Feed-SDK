package com.portableehr.model.convo;

import com.portableehr.model.LanguageEnum;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Conversation extends ConversationEnvelop {

    private List<Entry> entries = null;
    private List<Entry> unresolvedEntries = null;

    public Conversation(){
        super();
    }

    public Conversation(List<Entry> entries) {
        super();
        this.entries = entries;
    }

    public Conversation(List<Entry> entries, List<Entry> unresolvedEntries) {
        super();
        this.entries = entries;
        this.unresolvedEntries = unresolvedEntries;
    }

    public Conversation(UUID id, ConversationStatusEnum status, Map<LanguageEnum, String> location, String staffTittle, String clientTittle, Date createdOn, Date updatedOn,
                        List<Entry> entries, List<Participant> participants, List<Entry> unresolvedEntries) {
        super(id, status, location, staffTittle, clientTittle, participants, createdOn, updatedOn);
        this.entries = entries;
        this.unresolvedEntries = unresolvedEntries;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public List<Entry> getUnresolvedEntries() {
        return unresolvedEntries;
    }

    public void setUnresolvedEntries(List<Entry> unresolvedEntries) {
        this.unresolvedEntries = unresolvedEntries;
    }
}
