package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.portableehr.DateDeserializer;
import com.portableehr.model.LanguageEnum;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, defaultImpl = ConversationEnvelop.class)
@JsonSubTypes( {
        @JsonSubTypes.Type(Conversation.class)
})
public class ConversationEnvelop {

    private UUID id;
    private ConversationStatusEnum status;
    private Map<LanguageEnum, String> location;
    private String staffTittle;
    private String clientTittle;
    private List<Participant> participants = null;
    @JsonDeserialize(using = DateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date createdOn;
    @JsonDeserialize(using = DateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date updatedOn;

    public ConversationEnvelop() {
    }

    public ConversationEnvelop(UUID id, ConversationStatusEnum status, Map<LanguageEnum, String> location, String staffTittle, String clientTittle, List<Participant> participants, Date createdOn, Date updatedOn) {
        this.id = id;
        this.status = status;
        this.location = location;
        this.staffTittle = staffTittle;
        this.clientTittle = clientTittle;
        this.participants = participants;
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

    public Map<LanguageEnum, String> getLocation() {
        return location;
    }

    public void setLocation(Map<LanguageEnum, String> location) {
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

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
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
