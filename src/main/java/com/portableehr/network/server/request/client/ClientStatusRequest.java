/*
 * Copyright © Portable EHR inc, 2025
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.ClientStatus;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * Request send by FeedHub update a client Status
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pushSingle",
 *   "parameters": {@link ClientStatus}
 * }
 * </code></pre>
 */
public class ClientStatusRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private ClientStatus parameters = null;

    public ClientStatusRequest() {}

    public ClientStatusRequest(String feedAlias, RequestCommand command, ClientStatus parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public ClientStatus getParameters() {
        return parameters;
    }

    public void setParameters(ClientStatus parameters) {
        this.parameters = parameters;
    }

}
