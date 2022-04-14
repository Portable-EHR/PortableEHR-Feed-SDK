/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo.entry.attachment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * Request send by FeedHub to pull a single attachment
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pullSingle",
 *   "parameters": {@link AttachmentPullSingleParameters}
 * }
 * </code></pre>
 */
public class AttachmentPullSingleRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private AttachmentPullSingleParameters parameters = null;

    public AttachmentPullSingleRequest() {}

    public AttachmentPullSingleRequest(String feedAlias, RequestCommand command, AttachmentPullSingleParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public AttachmentPullSingleParameters getParameters() {
        return parameters;
    }

    public void setParameters(AttachmentPullSingleParameters parameters) {
        this.parameters = parameters;
    }

}
