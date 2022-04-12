package com.portableehr.model.convo;

public class EntryPayloadMove extends EntryPayload {

    private String fromLocation;
    private String toLocation;

    public EntryPayloadMove() {
    }

    public EntryPayloadMove(String fromLocation, String toLocation) {
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
