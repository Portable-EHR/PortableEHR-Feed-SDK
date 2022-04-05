/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.appointment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * The request sent by FeedHub to obtain the appointments
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pullSingle",
 *   "parameters": {@link AppointmentPullParameters}
 * }
 * </code></pre>
 */
public class AppointmentPullRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private AppointmentPullParameters parameters = null;

    public AppointmentPullRequest() {}

    public AppointmentPullRequest(String feedAlias, RequestCommand command, AppointmentPullParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public AppointmentPullParameters getParameters() {
        return parameters;
    }

    public void setParameters(AppointmentPullParameters parameters) {
        this.parameters = parameters;
    }
}
