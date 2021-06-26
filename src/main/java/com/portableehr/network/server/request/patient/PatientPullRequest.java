/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.patient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * Request send by FeedHub to obtain patients
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pullSingle",
 *   "parameters": {@link PatientPullParameters}
 * }
 * </code></pre>
 */
public class PatientPullRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private PatientPullParameters parameters = null;

    public PatientPullRequest() {}

    public PatientPullRequest(String feedAlias, String command, PatientPullParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public PatientPullParameters getParameters() {
        return parameters;
    }

    public void setParameters(PatientPullParameters parameters) {
        this.parameters = parameters;
    }

}
