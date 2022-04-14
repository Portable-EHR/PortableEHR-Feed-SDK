/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo.entry;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.server.request.FeedHubRequest;
import com.portableehr.network.server.request.convo.ConvoPushSingleParameters;

/**
 * Request send by FeedHub to add an Entry to a conversation
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pushSingle",
 *   "parameters": {@link ConvoPushSingleParameters}
 * }
 * </code></pre>
 */
public class EntryPushSingleRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private EntryPushSingleParameters parameters = null;

    public EntryPushSingleRequest() {}

    public EntryPushSingleRequest(String feedAlias, RequestCommand command, EntryPushSingleParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public EntryPushSingleParameters getParameters() {
        return parameters;
    }

    public void setParameters(EntryPushSingleParameters parameters) {
        this.parameters = parameters;
    }

}
