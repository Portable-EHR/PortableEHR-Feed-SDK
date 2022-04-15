package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Date;
import java.util.UUID;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes( {
        @JsonSubTypes.Type(Conversation.class)
})
public class ConversationEnvelop {

    private UUID id;
    private ConversationStatusEnum status;
    private String location;
    private String staffTittle;
    private String clientTittle;
    private Date createdOn;
    private Date updatedOn;

    public ConversationEnvelop() {
    }

    public ConversationEnvelop(UUID id, ConversationStatusEnum status, String location, String staffTittle, String clientTittle, Date createdOn, Date updatedOn) {
        this.id = id;
        this.status = status;
        this.location = location;
        this.staffTittle = staffTittle;
        this.clientTittle = clientTittle;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ConversationStatusEnum getStatus() {
        return status;
    }

    public void setStatus(ConversationStatusEnum status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStaffTittle() {
        return staffTittle;
    }

    public void setStaffTittle(String staffTittle) {
        this.staffTittle = staffTittle;
    }

    public String getClientTittle() {
        return clientTittle;
    }

    public void setClientTittle(String clientTittle) {
        this.clientTittle = clientTittle;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}
