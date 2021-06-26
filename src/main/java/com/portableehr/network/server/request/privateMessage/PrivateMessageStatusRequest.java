/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.privateMessage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * Request sent by FeedHub to set a private message's status
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pushSingle",
 *   "parameters": {@link PrivateMessageStatusParameters}
 * }
 * </code></pre>
 */
public class PrivateMessageStatusRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private PrivateMessageStatusParameters parameters = null;

    public PrivateMessageStatusRequest() {}

    public PrivateMessageStatusRequest(String feedAlias, String command, PrivateMessageStatusParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public PrivateMessageStatusParameters getParameters() {
        return parameters;
    }

    public void setParameters(PrivateMessageStatusParameters parameters) {
        this.parameters = parameters;
    }

}
