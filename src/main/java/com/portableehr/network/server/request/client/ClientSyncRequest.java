/*
 * Copyright © Portable EHR inc, 2025
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.BackendClient;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * Request send by FeedHub synchronize a client
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pushSingle",
 *   "parameters": {@link BackendClient}
 * }
 * </code></pre>
 */
public class ClientSyncRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private BackendClient parameters = null;

    public ClientSyncRequest() {}

    public ClientSyncRequest(String feedAlias, RequestCommand command, BackendClient parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public BackendClient getParameters() {
        return parameters;
    }

    public void setParameters(BackendClient parameters) {
        this.parameters = parameters;
    }

}
