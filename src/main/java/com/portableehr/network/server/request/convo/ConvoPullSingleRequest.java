/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * Request send by FeedHub to pull a single conversation
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pullSingle",
 *   "parameters": {@link ConvoPullSingleParameters}
 * }
 * </code></pre>
 */
public class ConvoPullSingleRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private ConvoPullSingleParameters parameters = null;

    public ConvoPullSingleRequest() {}

    public ConvoPullSingleRequest(String feedAlias, RequestCommand command, ConvoPullSingleParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public ConvoPullSingleParameters getParameters() {
        return parameters;
    }

    public void setParameters(ConvoPullSingleParameters parameters) {
        this.parameters = parameters;
    }

}
