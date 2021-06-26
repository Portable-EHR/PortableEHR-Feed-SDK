/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.appointment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameter for the {@link AppointmentPullRequest} with "command": "pullSingle"
 * <pre><code>
 * {
 *      "feedItemId": "00000000-0000-0000-0000-000000000000",
 * }
 * </code></pre>
 */
public class AppointmentPullSingleParameters extends AppointmentPullParameters {

    @JsonProperty("feedItemId")
    private String feedItemId = null;

    public AppointmentPullSingleParameters() {
    }

    public AppointmentPullSingleParameters(String feedItemId) {
        this.feedItemId = feedItemId;
    }

    public String getFeedItemId() {
        return feedItemId;
    }

    public void setFeedItemId(String feedItemId) {
        this.feedItemId = feedItemId;
    }
}
