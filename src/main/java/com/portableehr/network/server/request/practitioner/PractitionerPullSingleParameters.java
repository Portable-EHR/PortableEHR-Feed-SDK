/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.practitioner;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.request.patient.PatientPullRequest;

/**
 * The parameters for the {@link PatientPullRequest} with "command": "pullSingle"
 * <pre><code>
 * {
 *     "feedItemId": "00000000-0000-0000-0000-000000000000"
 * }
 * </code></pre>
 */
public class PractitionerPullSingleParameters extends PractitionerPullParameters {

    @JsonProperty("feedItemId")
    private String feedItemId = null;

    public PractitionerPullSingleParameters() {
    }

    public PractitionerPullSingleParameters(String feedItemId) {
        this.feedItemId = feedItemId;
    }

    public String getFeedItemId() {
        return feedItemId;
    }

    public void setFeedItemId(String feedItemId) {
        this.feedItemId = feedItemId;
    }
}
