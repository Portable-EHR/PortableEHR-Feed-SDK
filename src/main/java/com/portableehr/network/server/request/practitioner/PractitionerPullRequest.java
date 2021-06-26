/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.practitioner;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * The request sent by FeedHub to obtain the practitioners
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pullSingle",
 *   "parameters": {@link PractitionerPullParameters}
 * }
 * </code></pre>
 */
public class PractitionerPullRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private PractitionerPullParameters parameters = null;

    public PractitionerPullRequest() {}

    public PractitionerPullRequest(String feedAlias, String command, PractitionerPullParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public PractitionerPullParameters getParameters() {
        return parameters;
    }

    public void setParameters(PractitionerPullParameters parameters) {
        this.parameters = parameters;
    }
}
