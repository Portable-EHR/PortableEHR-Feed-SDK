/*
 * Copyright © Portable EHR inc, 2023
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.client.invite;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.client.request.FeedBackendRequest;

/**
 * Request sent to FeedHub to invite a client to install and activate the app
 * <pre><code>
 * {
 *      "feedAlias": "fiktivDP",
 *      "command": "pushSingle",
 *      "parameters": {@link ClientInviteParameters}
 * }
 * </code></pre>
 */
public class ClientInviteRequest extends FeedBackendRequest {

    @JsonProperty("parameters")
    private ClientInviteParameters parameters = null;

    public ClientInviteRequest() {}

    public ClientInviteRequest(String feedAlias, RequestCommand command, ClientInviteParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public ClientInviteParameters getParameters() {
        return parameters;
    }

    public void setParameters(ClientInviteParameters parameters) {
        this.parameters = parameters;
    }

}
