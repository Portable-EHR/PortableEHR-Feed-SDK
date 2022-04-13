package com.portableehr.model.convo;

import java.util.UUID;

public class EntryPayloadParticipant extends EntryPayload {

    private UUID participantId;
    private EntryPayloadParticipantActionEnum action;
    private ParticipantRoleEnum role;

    public EntryPayloadParticipant() {
    }

    public EntryPayloadParticipant(UUID participantId, EntryPayloadParticipantActionEnum action, ParticipantRoleEnum role) {
        this.participantId = participantId;
        this.action = action;
        this.role = role;
    }

    public UUID getParticipantId() {
        return participantId;
    }

    public void setParticipantId(UUID participantId) {
        this.participantId = participantId;
    }

    public EntryPayloadParticipantActionEnum getAction() {
        return action;
    }

    public void setAction(EntryPayloadParticipantActionEnum action) {
        this.action = action;
    }

    public ParticipantRoleEnum getRole() {
        return role;
    }

    public void setRole(ParticipantRoleEnum role) {
        this.role = role;
    }
}
