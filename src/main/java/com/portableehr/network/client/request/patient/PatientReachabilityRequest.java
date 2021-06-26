/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.patient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.client.request.FeedBackendRequest;

/**
 * Request sent to FeedHub to obtain a patient reachability status.
 * <pre><code>
 * {
 *      "feedAlias": "fiktivDP",
 *      "command": "pullSingle",
 *      "parameters": {@link PatientReachabilityParameters}
 * }
 * </code></pre>
 */
public class PatientReachabilityRequest extends FeedBackendRequest {

    @JsonProperty("parameters")
    private PatientReachabilityParameters parameters = null;

    public PatientReachabilityRequest() {}

    public PatientReachabilityRequest(String feedAlias, String command, PatientReachabilityParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public PatientReachabilityParameters getParameters() {
        return parameters;
    }

    public void setParameters(PatientReachabilityParameters parameters) {
        this.parameters = parameters;
    }

}
