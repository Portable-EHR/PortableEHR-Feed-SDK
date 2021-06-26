/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.privateMessage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.client.request.FeedBackendRequestParameters;

import java.util.Date;

/**
 * Superclass for the parameters to send in the {@link PrivateMessageNotificationRequest}.<br><br>
 * Subclasses:<br>
 * {@link PrivateMessageNotificationParametersWithPhysicianId}<br>
 * {@link PrivateMessageNotificationParametersWithAuthor}<br>
 */
public abstract class PrivateMessageNotificationParameters extends FeedBackendRequestParameters {

    @JsonProperty("messageId")
    private String messageId = null;

    @JsonProperty("patientId")
    private String patientId = null;

    @JsonProperty("dateCreated")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date dateCreated = null;

    public PrivateMessageNotificationParameters() {
    }

    public PrivateMessageNotificationParameters(String messageId, String patientId, Date dateCreated) {
        this.messageId = messageId;
        this.patientId = patientId;
        this.dateCreated = dateCreated;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
