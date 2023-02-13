package com.portableehr.model.convo.shared;

import java.time.Instant;

public class SharedPrivateMessageAttachment {

    private String name;
    private Instant date;
    private String type;
    private String ext;
    private String b64;

    public SharedPrivateMessageAttachment() {
    }

    public SharedPrivateMessageAttachment(String name, Instant date, String type, String ext, String b64) {
        this.name = name;
        this.date = date;
        this.type = type;
        this.ext = ext;
        this.b64 = b64;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getB64() {
        return b64;
    }

    public void setB64(String b64) {
        this.b64 = b64;
    }
}
