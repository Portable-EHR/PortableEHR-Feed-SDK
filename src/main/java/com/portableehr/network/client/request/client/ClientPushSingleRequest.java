/*
 * Copyright © Portable EHR inc, 2024
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.client.request.FeedBackendRequest;

/**
 * Request sent to FeedHub to add a client
 * <pre><code>
 * {
 *      "feedAlias": "fiktivDP",
 *      "command": "pushSingle",
 *      "parameters": {@link ClientPushSingleParameters}
 * }
 * </code></pre>
 */
public class ClientPushSingleRequest extends FeedBackendRequest {

    @JsonProperty("parameters")
    private ClientPushSingleParameters parameters = null;

    public ClientPushSingleRequest() {}

    public ClientPushSingleRequest(String feedAlias, RequestCommand command, ClientPushSingleParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public ClientPushSingleParameters getParameters() {
        return parameters;
    }

    public void setParameters(ClientPushSingleParameters parameters) {
        this.parameters = parameters;
    }

}
