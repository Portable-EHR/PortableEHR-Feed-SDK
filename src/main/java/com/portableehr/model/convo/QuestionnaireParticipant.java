package com.portableehr.model.convo;

import java.util.UUID;

public class QuestionnaireParticipant {
    private UUID participantUUID;
    private String token;
    private QuestionnaireParticipantStatusEnum status;

    public QuestionnaireParticipant() {
    }

    public QuestionnaireParticipant(UUID participantUUID, String token, QuestionnaireParticipantStatusEnum status) {
        this.participantUUID = participantUUID;
        this.token = token;
        this.status = status;
    }

    public UUID getParticipantUUID() {
        return participantUUID;
    }

    public void setParticipantUUID(UUID participantUUID) {
        this.participantUUID = participantUUID;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public QuestionnaireParticipantStatusEnum getStatus() {
        return status;
    }

    public void setStatus(QuestionnaireParticipantStatusEnum status) {
        this.status = status;
    }
}
