/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.appointment;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.portableehr.model.server.Appointment;

/**
 * The responseContent attribute for the ${@link AppointmentPullResponse} to the /appointment
 * FeedHub request with "command": "pullSingle"
 * <pre><code>
 * Serializes in the format of {@link Appointment}
 * </code></pre>
 */
public class AppointmentPullSingleResponseContent extends AppointmentPullResponseContent {

    @JsonUnwrapped
    Appointment result = null;

    public AppointmentPullSingleResponseContent() {
    }

    public AppointmentPullSingleResponseContent(Appointment result) {
        this.result = result;
    }

    public Appointment getResult() {
        return result;
    }

    public void setResult(Appointment result) {
        this.result = result;
    }

}
