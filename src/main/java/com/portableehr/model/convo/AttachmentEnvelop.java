package com.portableehr.model.convo;

import java.util.Date;
import java.util.UUID;

public class AttachmentEnvelop {

    private UUID id;
    private String name;
    private String mimeType;

    public AttachmentEnvelop() {
    }

    public AttachmentEnvelop(UUID id, String name, String mimeType) {
        this.id = id;
        this.name = name;
        this.mimeType = mimeType;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
}
