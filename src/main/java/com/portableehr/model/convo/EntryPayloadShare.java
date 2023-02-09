package com.portableehr.model.convo;

import java.util.UUID;

public class EntryPayloadShare extends EntryPayload {

    private UUID id;
    private String text;
    private ShareTypeEnum type;

    public EntryPayloadShare() {
    }

    public EntryPayloadShare(UUID id, String text, ShareTypeEnum type) {
        this.id = id;
        this.text = text;
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ShareTypeEnum getType() {
        return type;
    }

    public void setType(ShareTypeEnum type) {
        this.type = type;
    }
}