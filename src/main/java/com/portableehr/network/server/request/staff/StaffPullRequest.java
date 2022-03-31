/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.staff;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * The request sent by FeedHub to obtain the staff members
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pullSingle",
 *   "parameters": {@link StaffPullParameters}
 * }
 * </code></pre>
 */
public class StaffPullRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private StaffPullParameters parameters = null;

    public StaffPullRequest() {}

    public StaffPullRequest(String feedAlias, String command, StaffPullParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public StaffPullParameters getParameters() {
        return parameters;
    }

    public void setParameters(StaffPullParameters parameters) {
        this.parameters = parameters;
    }
}
