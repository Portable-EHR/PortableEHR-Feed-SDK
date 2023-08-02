package com.portableehr.model.convo;

import java.util.Date;

public class EntryPayloadMove extends EntryPayload {

    private String fromLocation;
    private String toLocation;

    public EntryPayloadMove() {
    }

    public EntryPayloadMove(String fromLocation, String toLocation) {
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
    }

    public EntryPayloadMove(String freeTextReply, Date dateReply, Date dateTimeReply, ChoiceOption choiceReply, String fromLocation, String toLocation) {
        super(freeTextReply, dateReply, dateTimeReply, choiceReply);
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }
}
