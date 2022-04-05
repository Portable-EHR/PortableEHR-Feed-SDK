/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.privateMessage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.client.request.FeedBackendRequest;

/**
 * Request sent to FeedHub to notify about a new private message.
 * <pre><code>
 * {
 *    "feedAlias": "fiktivDP",
 *    "command": "pushSingle",
 *    "parameters": {@link PrivateMessageNotificationParameters}
 * }
 * </code></pre>
 */
public class PrivateMessageNotificationRequest extends FeedBackendRequest {

    @JsonProperty("parameters")
    private PrivateMessageNotificationParameters parameters = null;

    public PrivateMessageNotificationRequest() {}

    public PrivateMessageNotificationRequest(String feedAlias, RequestCommand command, PrivateMessageNotificationParameters parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public PrivateMessageNotificationParameters getParameters() {
        return parameters;
    }

    public void setParameters(PrivateMessageNotificationParameters parameters) {
        this.parameters = parameters;
    }
}
