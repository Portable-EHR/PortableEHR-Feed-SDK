/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.patient;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.portableehr.model.server.Patient;

/**
 * The responseContent attribute for the ${@link PatientPullResponse} to the /patient
 * FeedHub request with "command": "pullSingle"
 * <pre><code>
 * Serializes as {@link Patient}
 * </code></pre>
 */
public class PatientPullSingleResponseContent extends PatientPullResponseContent {

    @JsonUnwrapped
    Patient result = null;

    public PatientPullSingleResponseContent() {
    }

    public PatientPullSingleResponseContent(Patient patient) {
        this.result = patient;
    }

    public Patient getResult() {
        return result;
    }

    public void setResult(Patient result) {
        this.result = result;
    }
}
