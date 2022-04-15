/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo.entry.status;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * Request send by FeedHub to update a list of EntryStatus
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pushBundle",
 *   "parameters": {@link EntryStatusPushBundleParameters}
 * }
 * </code></pre>
 */
public class EntryStatusPushBundleRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private EntryStatusPushBundleParameters parameters = null;

    public EntryStatusPushBundleRequest() {}

    public EntryStatusPushBundleRequest(String feedAlias, RequestCommand command, EntryStatusPushBundleParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public EntryStatusPushBundleParameters getParameters() {
        return parameters;
    }

    public void setParameters(EntryStatusPushBundleParameters parameters) {
        this.parameters = parameters;
    }

}
