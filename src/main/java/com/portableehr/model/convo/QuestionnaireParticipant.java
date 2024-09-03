package com.portableehr.model.convo;

import java.util.UUID;

public class QuestionnaireParticipant {
    private UUID participantUUID;
    private String token;

    public QuestionnaireParticipant() {
    }

    public QuestionnaireParticipant(UUID participantUUID, String token) {
        this.participantUUID = participantUUID;
        this.token = token;
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
}
