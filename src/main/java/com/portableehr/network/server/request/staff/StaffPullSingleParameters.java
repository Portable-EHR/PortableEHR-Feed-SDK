/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.staff;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters for the {@link StaffPullRequest} with "command": "pullSingle"
 * <pre><code>
 * {
 *     "feedItemId": "00000000-0000-0000-0000-000000000000"
 * }
 * </code></pre>
 */
public class StaffPullSingleParameters extends StaffPullParameters {

    @JsonProperty("feedItemId")
    private String feedItemId = null;

    public StaffPullSingleParameters() {
    }

    public StaffPullSingleParameters(String feedItemId) {
        this.feedItemId = feedItemId;
    }

    public String getFeedItemId() {
        return feedItemId;
    }

    public void setFeedItemId(String feedItemId) {
        this.feedItemId = feedItemId;
    }
}
