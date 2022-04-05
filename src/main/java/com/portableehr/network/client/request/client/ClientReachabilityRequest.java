/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.client.request.FeedBackendRequest;

/**
 * Request sent to FeedHub to obtain a client reachability status.
 * <pre><code>
 * {
 *      "feedAlias": "fiktivDP",
 *      "command": "pullSingle",
 *      "parameters": {@link ClientReachabilityParameters}
 * }
 * </code></pre>
 */
public class ClientReachabilityRequest extends FeedBackendRequest {

    @JsonProperty("parameters")
    private ClientReachabilityParameters parameters = null;

    public ClientReachabilityRequest() {}

    public ClientReachabilityRequest(String feedAlias, RequestCommand command, ClientReachabilityParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public ClientReachabilityParameters getParameters() {
        return parameters;
    }

    public void setParameters(ClientReachabilityParameters parameters) {
        this.parameters = parameters;
    }

}
