package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.UUID;

public class MentionedParticipant {

    private UUID participantId;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"
    )
    private Date reminder;
    private ReminderMethodEnum reminderMethod;
    private ReminderStateEnum state;

    public MentionedParticipant() {
    }

    public MentionedParticipant(UUID participantId, Date reminder, ReminderMethodEnum reminderMethod, ReminderStateEnum state) {
        this.participantId = participantId;
        this.reminder = reminder;
        this.reminderMethod = reminderMethod;
        this.state = state;
    }

    public UUID getParticipantId() {
        return participantId;
    }

    public void setParticipantId(UUID participantId) {
        this.participantId = participantId;
    }

    public Date getReminder() {
        return reminder;
    }

    public void setReminder(Date reminder) {
        this.reminder = reminder;
    }

    public ReminderMethodEnum getReminderMethod() {
        return reminderMethod;
    }

    public void setReminderMethod(ReminderMethodEnum reminderMethod) {
        this.reminderMethod = reminderMethod;
    }

    public ReminderStateEnum getState() {
        return state;
    }

    public void setState(ReminderStateEnum state) {
        this.state = state;
    }
}
