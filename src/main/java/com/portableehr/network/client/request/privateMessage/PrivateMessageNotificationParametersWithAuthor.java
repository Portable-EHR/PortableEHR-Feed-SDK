/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.privateMessage;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Parameters for the {@link PrivateMessageNotificationRequest} with a text field for the author of the note
 * <pre><code>
 * {
 *      "messageId": "00000000-0000-0000-0000-000000000000",
 *      "patientId": "00000000-0000-0000-0000-000000000000",
 *      "dateCreated": "2021-03-03T14:51:43.622Z",
 *      "author": "Dr Gueritout"
 * }
 * </code></pre>
 */
public class PrivateMessageNotificationParametersWithAuthor extends PrivateMessageNotificationParameters{

    @JsonProperty("author")
    private String author = null;

    public PrivateMessageNotificationParametersWithAuthor() {

    }

    public PrivateMessageNotificationParametersWithAuthor(String messageId, String patientId, Date dateCreated, String physicianId) {
        super(messageId, patientId, dateCreated);
        this.author = physicianId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
