package com.portableehr.model.convo;

import java.util.UUID;

public class Attachment extends AttachmentEnvelop {
    private String b64;

    public Attachment() {
    }

    public Attachment(UUID id, String name, String mimeType, String b64) {
        super(id, name, mimeType);
        this.b64 = b64;
    }

    public String getB64() {
        return b64;
    }

    public void setB64(String b64) {
        this.b64 = b64;
    }
}
