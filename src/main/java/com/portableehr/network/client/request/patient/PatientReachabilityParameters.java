/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.patient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.client.request.FeedBackendRequestParameters;

/**
 * The parameters to sent in the patient reachability.
 * <pre><code>
 * {
 *      "patientId": "00000000-0000-0000-0000-000000000000"
 * }
 * </code></pre>
 */
public class PatientReachabilityParameters extends FeedBackendRequestParameters {

    @JsonProperty("patientId")
    private String patientId = null;

    public PatientReachabilityParameters() {
    }

    public PatientReachabilityParameters(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
}
