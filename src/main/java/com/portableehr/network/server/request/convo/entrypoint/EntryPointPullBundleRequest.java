/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo.entrypoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.server.request.FeedHubRequest;
import com.portableehr.network.server.request.FeedHubRequestParameters;
import com.portableehr.network.server.request.convo.ConvoPullSingleParameters;

/**
 * Request send by FeedHub to pull the list of conversations entry points of an organization
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pullBundle",
 *   "parameters": {@link EntryPointPullBundleParameters}
 * }
 * </code></pre>
 */
public class EntryPointPullBundleRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private EntryPointPullBundleParameters parameters = null;

    public EntryPointPullBundleRequest() {}

    public EntryPointPullBundleRequest(String feedAlias, RequestCommand command, EntryPointPullBundleParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public EntryPointPullBundleParameters getParameters() {
        return parameters;
    }

    public void setParameters(EntryPointPullBundleParameters parameters) {
        this.parameters = parameters;
    }

}
