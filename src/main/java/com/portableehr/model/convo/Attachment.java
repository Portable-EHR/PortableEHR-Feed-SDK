package com.portableehr.model.convo;

import java.util.UUID;

public class Attachment extends AttachmentEnvelop {
    private byte[] b64;

    public Attachment() {
    }

    public Attachment(UUID id, String name, String mimeType, byte[] b64) {
        super(id, name, mimeType);
        this.b64 = b64;
    }

    public byte[] getB64() {
        return b64;
    }

    public void setB64(byte[] b64) {
        this.b64 = b64;
    }
}
