/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * Request send by FeedHub to create a conversation
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pushSingle",
 *   "parameters": {@link ConvoPushSingleParameters}
 * }
 * </code></pre>
 */
public class ConvoPushSingleRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private ConvoPushSingleParameters parameters = null;

    public ConvoPushSingleRequest() {}

    public ConvoPushSingleRequest(String feedAlias, RequestCommand command, ConvoPushSingleParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public ConvoPushSingleParameters getParameters() {
        return parameters;
    }

    public void setParameters(ConvoPushSingleParameters parameters) {
        this.parameters = parameters;
    }

}
