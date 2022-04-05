/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.appointment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * The request from FeedHub to change the Appointment Disposition
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pushSingle",
 *   "parameters": {@link AppointmentDispositionParameters}
 * }
 * </code></pre>
 */
public class AppointmentDispositionRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private AppointmentDispositionParameters parameters = null;

    public AppointmentDispositionRequest() {}

    public AppointmentDispositionRequest(String feedAlias, RequestCommand command, AppointmentDispositionParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public AppointmentDispositionParameters getParameters() {
        return parameters;
    }

    public void setParameters(AppointmentDispositionParameters parameters) {
        this.parameters = parameters;
    }
}
