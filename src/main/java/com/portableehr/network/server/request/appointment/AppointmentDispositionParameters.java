/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.appointment;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.server.AppointmentDispositionEnum;
import com.portableehr.network.server.request.FeedHubRequestParameters;

import java.util.Date;

/**
 * The parameters for the {@link AppointmentDispositionRequest}
 * <pre><code>
 * {
 *     "id": "00000000-0000-0000-0000-000000000000",
 *     "status": {@link AppointmentDispositionEnum},
 *     "lastUpdated": "2021-01-14T23:41:21.050Z"
 * }
 * </code></pre>
 */
public class AppointmentDispositionParameters extends FeedHubRequestParameters {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("status")
    private AppointmentDispositionEnum status = null;

    @JsonProperty("lastUpdated")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date lastUpdated = null;

    public AppointmentDispositionParameters() {
    }

    public AppointmentDispositionParameters(String id, AppointmentDispositionEnum status, Date lastUpdated) {
        this.id = id;
        this.status = status;
        this.lastUpdated = lastUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AppointmentDispositionEnum getStatus() {
        return status;
    }

    public void setStatus(AppointmentDispositionEnum status) {
        this.status = status;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
