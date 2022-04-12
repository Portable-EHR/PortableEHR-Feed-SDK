package com.portableehr.model.convo;

import java.util.List;

public class EntryPayloadMessage extends EntryPayload {

    private String text;
    private List<AttachmentEnvelop> attachments;

    public EntryPayloadMessage() {
    }

    public EntryPayloadMessage(String text, List<AttachmentEnvelop> attachments) {
        this.text = text;
        this.attachments = attachments;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<AttachmentEnvelop> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentEnvelop> attachments) {
        this.attachments = attachments;
    }
}
