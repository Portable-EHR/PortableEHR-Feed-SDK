/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.externalMessage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.ExternalMessage;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.client.request.FeedBackendRequest;

/**
 * Request sent to FeedHub to deliver an {@link ExternalMessage}.
 * <pre><code>
 * {
 *    "feedAlias": "fiktivDP",
 *    "command": "funnelSingle",
 *    "parameters": [{@link ExternalMessage}]
 * }
 * </code></pre>
 */
public class ExternalMessagePushSingleRequest extends FeedBackendRequest {

    @JsonProperty("parameters")
    private ExternalMessage parameters = null;

    public ExternalMessagePushSingleRequest() {
    }

    public ExternalMessagePushSingleRequest(ExternalMessage parameters) {
        this.parameters = parameters;
    }

    public ExternalMessagePushSingleRequest(String feedAlias, RequestCommand command, ExternalMessage parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    @Override
    public ExternalMessage getParameters() {
        return this.parameters;
    }

    public void setParameters(ExternalMessage parameters) {
        this.parameters = parameters;
    }
}
