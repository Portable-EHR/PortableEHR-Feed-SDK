package com.portableehr.model.convo;

import java.util.UUID;

public class EntryPayloadParticipant extends EntryPayload {

    private UUID targetParticipantGuid;
    private EntryPayloadParticipantActionEnum action;
    private ParticipantRoleEnum role;

    public EntryPayloadParticipant() {
    }

    public EntryPayloadParticipant(UUID participantId, EntryPayloadParticipantActionEnum action, ParticipantRoleEnum role) {
        this.targetParticipantGuid = participantId;
        this.action = action;
        this.role = role;
    }

    public UUID getTargetParticipantGuid() {
        return targetParticipantGuid;
    }

    public void setTargetParticipantGuid(UUID targetParticipantGuid) {
        this.targetParticipantGuid = targetParticipantGuid;
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
