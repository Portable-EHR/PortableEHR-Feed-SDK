package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.UUID;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, defaultImpl = AttachmentEnvelop.class)
@JsonSubTypes( {
        @JsonSubTypes.Type(Attachment.class),
})
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
