package com.portableehr.model.convo.shared;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class SharedPrivateMessage {
    private String source;
    private String shortNameSource;
    private String from;
    private String client;
    private String to;
    private String messageB64;
    private String subject;
    private String context;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date createdOn;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date receivedOn;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date sentOn;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date seenOn;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date notifiedOn;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date remindedOn;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date failedOn;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date acknowledgedOn;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date fellBackOn;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date sendReminderOn;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date sendFallbackOn;

    private List<SharedPrivateMessageAttachment> attachments;

    public SharedPrivateMessage() {
    }

    public SharedPrivateMessage(String source, String shortNameSource, String from, String client, String to, String messageB64, String subject, String context,
                                Date createdOn, Date receivedOn, Date sentOn, Date seenOn, Date notifiedOn, Date remindedOn, Date failedOn,
                                Date acknowledgedOn, Date fellBackOn, Date sendReminderOn, Date sendFallbackOn, List<SharedPrivateMessageAttachment> attachments) {
        this.source = source;
        this.shortNameSource = shortNameSource;
        this.from = from;
        this.client = client;
        this.to = to;
        this.messageB64 = messageB64;
        this.subject = subject;
        this.context = context;
        this.createdOn = createdOn;
        this.receivedOn = receivedOn;
        this.sentOn = sentOn;
        this.seenOn = seenOn;
        this.notifiedOn = notifiedOn;
        this.remindedOn = remindedOn;
        this.failedOn = failedOn;
        this.acknowledgedOn = acknowledgedOn;
        this.fellBackOn = fellBackOn;
        this.sendReminderOn = sendReminderOn;
        this.sendFallbackOn = sendFallbackOn;
        this.attachments = attachments;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getShortNameSource() {
        return shortNameSource;
    }

    public void setShortNameSource(String shortNameSource) {
        this.shortNameSource = shortNameSource;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessageB64() {
        return messageB64;
    }

    public void setMessageB64(String messageB64) {
        this.messageB64 = messageB64;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getReceivedOn() {
        return receivedOn;
    }

    public void setReceivedOn(Date receivedOn) {
        this.receivedOn = receivedOn;
    }

    public Date getSentOn() {
        return sentOn;
    }

    public void setSentOn(Date sentOn) {
        this.sentOn = sentOn;
    }

    public Date getSeenOn() {
        return seenOn;
    }

    public void setSeenOn(Date seenOn) {
        this.seenOn = seenOn;
    }

    public Date getNotifiedOn() {
        return notifiedOn;
    }

    public void setNotifiedOn(Date notifiedOn) {
        this.notifiedOn = notifiedOn;
    }

    public Date getRemindedOn() {
        return remindedOn;
    }

    public void setRemindedOn(Date remindedOn) {
        this.remindedOn = remindedOn;
    }

    public Date getFailedOn() {
        return failedOn;
    }

    public void setFailedOn(Date failedOn) {
        this.failedOn = failedOn;
    }

    public Date getAcknowledgedOn() {
        return acknowledgedOn;
    }

    public void setAcknowledgedOn(Date acknowledgedOn) {
        this.acknowledgedOn = acknowledgedOn;
    }

    public Date getFellBackOn() {
        return fellBackOn;
    }

    public void setFellBackOn(Date fellBackOn) {
        this.fellBackOn = fellBackOn;
    }

    public Date getSendReminderOn() {
        return sendReminderOn;
    }

    public void setSendReminderOn(Date sendReminderOn) {
        this.sendReminderOn = sendReminderOn;
    }

    public Date getSendFallbackOn() {
        return sendFallbackOn;
    }

    public void setSendFallbackOn(Date sendFallbackOn) {
        this.sendFallbackOn = sendFallbackOn;
    }

    public List<SharedPrivateMessageAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<SharedPrivateMessageAttachment> attachments) {
        this.attachments = attachments;
    }
}
