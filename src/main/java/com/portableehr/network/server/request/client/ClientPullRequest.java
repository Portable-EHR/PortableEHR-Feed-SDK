/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * Request send by FeedHub to obtain clients
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pullSingle",
 *   "parameters": {@link ClientPullParameters}
 * }
 * </code></pre>
 */
public class ClientPullRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private ClientPullParameters parameters = null;

    public ClientPullRequest() {}

    public ClientPullRequest(String feedAlias, RequestCommand command, ClientPullParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public ClientPullParameters getParameters() {
        return parameters;
    }

    public void setParameters(ClientPullParameters parameters) {
        this.parameters = parameters;
    }

}
