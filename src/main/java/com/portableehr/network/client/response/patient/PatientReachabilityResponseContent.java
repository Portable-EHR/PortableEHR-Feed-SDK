/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.patient;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.portableehr.model.client.PatientReachability;
import com.portableehr.network.client.response.FeedHubApiResponseContent;

/**
 * The responseContent field for {@link PatientReachabilityResponse}<br><br>
 * Serialized as a {@link PatientReachability}
 */
public class PatientReachabilityResponseContent extends FeedHubApiResponseContent {

    @JsonUnwrapped
    private PatientReachability patientReachability = null;

    public PatientReachabilityResponseContent() {
    }

    public PatientReachabilityResponseContent(PatientReachability patientReachability) {
        this.patientReachability = patientReachability;
    }

    public PatientReachability getPatientReachability() {
        return patientReachability;
    }

    public void setPatientReachability(PatientReachability patientReachability) {
        this.patientReachability = patientReachability;
    }
}
