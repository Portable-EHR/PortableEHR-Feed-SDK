/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.privateMessage;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Parameters for the {@link PrivateMessageNotificationRequest} with the id of the author of the note
 * <pre><code>
 * {
 *      "messageId": "00000000-0000-0000-0000-000000000000",
 *      "patientId": "00000000-0000-0000-0000-000000000000",
 *      "dateCreated": "2021-03-03T14:51:43.622Z",
 *      "physicianId": "00000000-0000-0000-0000-000000000000"
 * }
 * </code></pre>
 */
public class PrivateMessageNotificationParametersWithPhysicianId extends PrivateMessageNotificationParameters{

    @JsonProperty("physicianId")
    private String physicianId = null;

    public PrivateMessageNotificationParametersWithPhysicianId() {

    }

    public PrivateMessageNotificationParametersWithPhysicianId(String messageId, String patientId, Date dateCreated, String physicianId) {
        super(messageId, patientId, dateCreated);
        this.physicianId = physicianId;
    }

    public String getPhysicianId() {
        return physicianId;
    }

    public void setPhysicianId(String physicianId) {
        this.physicianId = physicianId;
    }
}
