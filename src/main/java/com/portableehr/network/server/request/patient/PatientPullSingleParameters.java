/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.patient;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters for the {@link PatientPullRequest} with "command": "pullBundle"
 * <pre><code>
 * {
 *     "feedItemId": "00000000-0000-0000-0000-000000000000"
 * }
 * </code></pre>
 */
public class PatientPullSingleParameters extends PatientPullParameters {

    @JsonProperty("feedItemId")
    private String feedItemId = null;

    public PatientPullSingleParameters() {
    }

    public PatientPullSingleParameters(String feedItemId) {
        this.feedItemId = feedItemId;
    }

    public String getFeedItemId() {
        return feedItemId;
    }

    public void setFeedItemId(String feedItemId) {
        this.feedItemId = feedItemId;
    }
}
