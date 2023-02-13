package com.portableehr.model.convo.shared;

import java.time.Instant;
import java.util.List;

public class SharedPrivateMessage {
    private String source;
    private String shortNameSource;
    private String from;
    private String patient;
    private String to;
    private String messageB64;
    private String subject;
    private String context;

    private Instant createdOn;
    private Instant receivedOn;
    private Instant sentOn;
    private Instant seenOn;
    private Instant notifiedOn;
    private Instant remindedOn;
    private Instant failedOn;
    private Instant acknowledgedOn;
    private Instant fellBackOn;
    private Instant sendReminderOn;
    private Instant sendFallbackOn;

    private List<SharedPrivateMessageAttachment> attachments;

    public SharedPrivateMessage() {
    }

    public SharedPrivateMessage(String source, String shortNameSource, String from, String patient, String to, String messageB64, String subject, String context,
                                Instant createdOn, Instant receivedOn, Instant sentOn, Instant seenOn, Instant notifiedOn, Instant remindedOn, Instant failedOn,
                                Instant acknowledgedOn, Instant fellBackOn, Instant sendReminderOn, Instant sendFallbackOn, List<SharedPrivateMessageAttachment> attachments) {
        this.source = source;
        this.shortNameSource = shortNameSource;
        this.from = from;
        this.patient = patient;
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

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
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

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public Instant getReceivedOn() {
        return receivedOn;
    }

    public void setReceivedOn(Instant receivedOn) {
        this.receivedOn = receivedOn;
    }

    public Instant getSentOn() {
        return sentOn;
    }

    public void setSentOn(Instant sentOn) {
        this.sentOn = sentOn;
    }

    public Instant getSeenOn() {
        return seenOn;
    }

    public void setSeenOn(Instant seenOn) {
        this.seenOn = seenOn;
    }

    public Instant getNotifiedOn() {
        return notifiedOn;
    }

    public void setNotifiedOn(Instant notifiedOn) {
        this.notifiedOn = notifiedOn;
    }

    public Instant getRemindedOn() {
        return remindedOn;
    }

    public void setRemindedOn(Instant remindedOn) {
        this.remindedOn = remindedOn;
    }

    public Instant getFailedOn() {
        return failedOn;
    }

    public void setFailedOn(Instant failedOn) {
        this.failedOn = failedOn;
    }

    public Instant getAcknowledgedOn() {
        return acknowledgedOn;
    }

    public void setAcknowledgedOn(Instant acknowledgedOn) {
        this.acknowledgedOn = acknowledgedOn;
    }

    public Instant getFellBackOn() {
        return fellBackOn;
    }

    public void setFellBackOn(Instant fellBackOn) {
        this.fellBackOn = fellBackOn;
    }

    public Instant getSendReminderOn() {
        return sendReminderOn;
    }

    public void setSendReminderOn(Instant sendReminderOn) {
        this.sendReminderOn = sendReminderOn;
    }

    public Instant getSendFallbackOn() {
        return sendFallbackOn;
    }

    public void setSendFallbackOn(Instant sendFallbackOn) {
        this.sendFallbackOn = sendFallbackOn;
    }

    public List<SharedPrivateMessageAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<SharedPrivateMessageAttachment> attachments) {
        this.attachments = attachments;
    }
}
