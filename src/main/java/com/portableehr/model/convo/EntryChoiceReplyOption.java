package com.portableehr.model.convo;

import java.util.UUID;

public class EntryChoiceReplyOption {

   private int id;
   private int entryId;
   private boolean disablesReplierReminder;
   private boolean disablesAuthorReminder;
   private String label;
   private UUID guid;

    public EntryChoiceReplyOption() {
    }

    public EntryChoiceReplyOption(int id, int entryId, boolean disablesReplierReminder, boolean disablesAuthorReminder, String label, UUID guid) {
        this.id = id;
        this.entryId = entryId;
        this.disablesReplierReminder = disablesReplierReminder;
        this.disablesAuthorReminder = disablesAuthorReminder;
        this.label = label;
        this.guid = guid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEntryId() {
        return entryId;
    }

    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    public boolean isDisablesReplierReminder() {
        return disablesReplierReminder;
    }

    public void setDisablesReplierReminder(boolean disablesReplierReminder) {
        this.disablesReplierReminder = disablesReplierReminder;
    }

    public boolean isDisablesAuthorReminder() {
        return disablesAuthorReminder;
    }

    public void setDisablesAuthorReminder(boolean disablesAuthorReminder) {
        this.disablesAuthorReminder = disablesAuthorReminder;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public UUID getGuid() {
        return guid;
    }

    public void setGuid(UUID guid) {
        this.guid = guid;
    }
}
