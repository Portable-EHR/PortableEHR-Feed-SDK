/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.reminder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.Reminder;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.client.request.FeedBackendRequest;

import java.util.List;

/**
 * Request sent to FeedHub to create or update a group of {@link com.portableehr.model.Reminder}.
 * <pre><code>
 * {
 *    "feedAlias": "fiktivDP",
 *    "command": "pushSingle",
 *    "parameters": [{@link Reminder}]
 * }
 * </code></pre>
 */
public class ReminderPushBundleRequest extends FeedBackendRequest {

    @JsonProperty("parameters")
    private List<Reminder> parameters = null;

    public ReminderPushBundleRequest() {
    }

    public ReminderPushBundleRequest(List<Reminder> parameters) {
        this.parameters = parameters;
    }

    public ReminderPushBundleRequest(String feedAlias, RequestCommand command, List<Reminder> parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    @Override
    public List<Reminder> getParameters() {
        return this.parameters;
    }

    public void setParameters(List<Reminder> parameters) {
        this.parameters = parameters;
    }
}
