/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.patient;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.portableehr.model.server.Client;

/**
 * The responseContent attribute for the ${@link PatientPullResponse} to the /patient
 * FeedHub request with "command": "pullSingle"
 * <pre><code>
 * Serializes as {@link Client}
 * </code></pre>
 */
public class PatientPullSingleResponseContent extends PatientPullResponseContent {

    @JsonUnwrapped
    Client result = null;

    public PatientPullSingleResponseContent() {
    }

    public PatientPullSingleResponseContent(Client client) {
        this.result = client;
    }

    public Client getResult() {
        return result;
    }

    public void setResult(Client result) {
        this.result = result;
    }
}
