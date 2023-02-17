package com.portableehr.model.convo.shared;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class SharedPrivateMessageAttachment {

    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date date;
    private String type;
    private String ext;
    private String b64;

    public SharedPrivateMessageAttachment() {
    }

    public SharedPrivateMessageAttachment(String name, Date date, String type, String ext, String b64) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
