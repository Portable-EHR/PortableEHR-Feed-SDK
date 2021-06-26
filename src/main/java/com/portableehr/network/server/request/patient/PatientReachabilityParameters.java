/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.patient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.request.FeedHubRequestParameters;

/**
 * The parameters for the {@link PatientReachabilityRequest}
 * <pre><code>
 * {
 *     "patientId": "00000000-0000-0000-0000-000000000000",
 *     "isReachable": true
 * }
 * </code></pre>
 */
public class PatientReachabilityParameters extends FeedHubRequestParameters {

    @JsonProperty("patientId")
    private String patientId = null;

    @JsonProperty("isReachable")
    private boolean isReachable;

    public PatientReachabilityParameters() {
    }

    public PatientReachabilityParameters(String patientId, boolean isReachable) {
        this.patientId = patientId;
        this.isReachable = isReachable;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public boolean getIsReachable() {
        return isReachable;
    }

    public void setIsReachable(boolean reachable) {
        isReachable = reachable;
    }
}
