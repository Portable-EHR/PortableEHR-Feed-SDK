/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.reminder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.Reminder;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.server.request.FeedHubRequest;

/**
 * Request sent by FeedHub to notify the feed of a trigger in a reminder being activated
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pushSingle",
 *   "parameters": {@link Reminder}
 * }
 * </code></pre>
 */
public class ReminderCallbackRequest extends FeedHubRequest {

    @JsonProperty("parameters")
    private Reminder parameters = null;

    public ReminderCallbackRequest() {}

    public ReminderCallbackRequest(String feedAlias, RequestCommand command, Reminder parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    public Reminder getParameters() {
        return parameters;
    }

    public void setParameters(Reminder parameters) {
        this.parameters = parameters;
    }

}
