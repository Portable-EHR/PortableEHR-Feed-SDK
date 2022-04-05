/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * Request sent by FeedHub to set a client reachability
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pushSingle",
 *   "parameters": {@link ClientReachabilityParameters}
 * }
 * </code></pre>
 */
public class ClientReachabilityRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private ClientReachabilityParameters parameters = null;

    public ClientReachabilityRequest() {
    }

    public ClientReachabilityRequest(String feedAlias, RequestCommand command, ClientReachabilityParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    @Override
    public ClientReachabilityParameters getParameters() {
        return parameters;
    }

    public void setParameters(ClientReachabilityParameters parameters) {
        this.parameters = parameters;
    }
}
