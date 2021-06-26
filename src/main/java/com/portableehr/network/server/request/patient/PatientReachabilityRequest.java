/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.patient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * Request sent by FeedHub to set a patient reachability
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pushSingle",
 *   "parameters": {@link PatientReachabilityParameters}
 * }
 * </code></pre>
 */
public class PatientReachabilityRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private PatientReachabilityParameters parameters = null;

    public PatientReachabilityRequest() {
    }

    public PatientReachabilityRequest(String feedAlias, String command, PatientReachabilityParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    @Override
    public PatientReachabilityParameters getParameters() {
        return parameters;
    }

    public void setParameters(PatientReachabilityParameters parameters) {
        this.parameters = parameters;
    }
}
