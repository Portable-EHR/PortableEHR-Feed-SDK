package com.portableehr.model.convo;

import java.util.Date;
import java.util.UUID;

public class Participant {

    /**
     * The id of the participation of someone in the conversation
     */
    private UUID id;
    /**
     * The id of the staff member or patient or any other sort of participant
     */
    private String participantId;
    private ParticipantTypeEnum type;
    private ParticipantRoleEnum role;
    private Date addedOn;
    private Date createdOn;

    public Participant() {
    }

    public Participant(UUID id, String participantId, ParticipantTypeEnum type, ParticipantRoleEnum role, Date addedOn, Date createdOn) {
        this.id = id;
        this.participantId = participantId;
        this.type = type;
        this.role = role;
        this.addedOn = addedOn;
        this.createdOn = createdOn;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public ParticipantTypeEnum getType() {
        return type;
    }

    public void setType(ParticipantTypeEnum type) {
        this.type = type;
    }

    public ParticipantRoleEnum getRole() {
        return role;
    }

    public void setRole(ParticipantRoleEnum role) {
        this.role = role;
    }

    public Date getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(Date addedOn) {
        this.addedOn = addedOn;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
