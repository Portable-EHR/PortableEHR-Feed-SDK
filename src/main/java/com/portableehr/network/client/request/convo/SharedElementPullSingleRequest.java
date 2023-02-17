/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.convo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.client.request.FeedBackendRequest;

/**
 * Request sent to FeedHub to pull an element shared in a conversation.
 * <pre><code>
 * {
 *      "feedAlias": "fiktivDP",
 *      "command": "pullSingle",
 *      "parameters": {@link SharedElementPullSingleParameters}
 * }
 * </code></pre>
 */
public class SharedElementPullSingleRequest extends FeedBackendRequest {

    @JsonProperty("parameters")
    private SharedElementPullSingleParameters parameters = null;

    public SharedElementPullSingleRequest() {}

    public SharedElementPullSingleRequest(String feedAlias, RequestCommand command, SharedElementPullSingleParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public SharedElementPullSingleParameters getParameters() {
        return parameters;
    }

    public void setParameters(SharedElementPullSingleParameters parameters) {
        this.parameters = parameters;
    }

}
