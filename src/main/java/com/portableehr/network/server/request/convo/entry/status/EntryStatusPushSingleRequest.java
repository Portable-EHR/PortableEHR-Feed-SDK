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
 *   "command": "pushSingle",
 *   "parameters": {@link EntryStatusPushSingleParameters}
 * }
 * </code></pre>
 */
public class EntryStatusPushSingleRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private EntryStatusPushSingleParameters parameters = null;

    public EntryStatusPushSingleRequest() {}

    public EntryStatusPushSingleRequest(String feedAlias, RequestCommand command, EntryStatusPushSingleParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public EntryStatusPushSingleParameters getParameters() {
        return parameters;
    }

    public void setParameters(EntryStatusPushSingleParameters parameters) {
        this.parameters = parameters;
    }

}
