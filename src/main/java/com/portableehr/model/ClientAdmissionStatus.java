/*
 * Copyright © Portable EHR inc, 2025
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * ClientAdmissionStatus
 * <pre><code>
 * {
 *      "statusCode": "{@link AdmissionStatusCodeEnum}"
 *      "message": {
 *          "renderer": "text",
 *          "en": "...",
 *          "fr": "...",
 *          "es": "..."
 *      },
 *      "createdOn": "2025-11-07T12:36:26+0000"
 * }
 * </code></pre>
 */
public class ClientAdmissionStatus {

    @JsonProperty("statusCode")
    private AdmissionStatusCodeEnum statusCode = null;

    @JsonProperty("message")
    private i18nText message = null;

    @JsonProperty("createdOn")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date createdOn = null;

    public ClientAdmissionStatus() {
    }

    public AdmissionStatusCodeEnum getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(AdmissionStatusCodeEnum statusCode) {
        this.statusCode = statusCode;
    }

    public i18nText getMessage() {
        return message;
    }

    public void setMessage(i18nText message) {
        this.message = message;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
