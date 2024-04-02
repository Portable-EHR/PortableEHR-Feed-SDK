/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.FeedItemStatusUpdate;
import com.portableehr.network.RequestCommand;

/**
 * Request sent by FeedHub to update the feed on the status of a feed item
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pushSingle",
 *   "parameters": {@link FeedItemStatusUpdate}
 * }
 * </code></pre>
 */
public class ApiResponseRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private FeedItemStatusUpdate parameters = null;

    public ApiResponseRequest() {}

    public ApiResponseRequest(String feedAlias, RequestCommand command, FeedItemStatusUpdate parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public FeedItemStatusUpdate getParameters() {
        return parameters;
    }

    public void setParameters(FeedItemStatusUpdate parameters) {
        this.parameters = parameters;
    }

}
