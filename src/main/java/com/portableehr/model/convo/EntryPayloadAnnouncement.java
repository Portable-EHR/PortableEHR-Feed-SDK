package com.portableehr.model.convo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class EntryPayloadAnnouncement extends EntryPayload {

    private String text;
    private List<AttachmentEnvelop> attachments;
    private String icon;

    public EntryPayloadAnnouncement() {
    }

    public EntryPayloadAnnouncement(String text, List<AttachmentEnvelop> attachments, String icon) {
        this.text = text;
        this.attachments = attachments;
        this.icon = icon;
    }

    public EntryPayloadAnnouncement(String freeTextReply, LocalDate dateReply, Date dateTimeReply, ChoiceOption choiceReply, String text, List<AttachmentEnvelop> attachments,
                                    String icon) {
        super(freeTextReply, dateReply, dateTimeReply, choiceReply);
        this.text = text;
        this.attachments = attachments;
        this.icon = icon;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
