/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.privateMessage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * Request sent by FeedHub to get the content of a private message
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pullSingle",
 *   "parameters": {@link PrivateMessageContentParameters}
 * }
 * </code></pre>
 */
public class PrivateMessageContentRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private PrivateMessageContentParameters parameters = null;

    public PrivateMessageContentRequest() {}

    public PrivateMessageContentRequest(String feedAlias, RequestCommand command, PrivateMessageContentParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public PrivateMessageContentParameters getParameters() {
        return parameters;
    }

    public void setParameters(PrivateMessageContentParameters parameters) {
        this.parameters = parameters;
    }

}
