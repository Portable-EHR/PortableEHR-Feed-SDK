/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.privateMessage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.request.FeedHubRequestParameters;

/**
 * Parameters sent by FeedHub in the {@link PrivateMessageContentRequest}
 * <pre><code>
 * {
 *     "feedItemId" : "00000000-0000-0000-0000-000000000000"
 * }
 * </code></pre>
 */
public class PrivateMessageContentParameters extends FeedHubRequestParameters {

    @JsonProperty("feedItemId")
    private String feedItemId = null;

    public PrivateMessageContentParameters() {
    }

    public PrivateMessageContentParameters(String feedItemId) {
        this.feedItemId = feedItemId;
    }

    public String getFeedItemId() {
        return feedItemId;
    }

    public void setFeedItemId(String feedItemId) {
        this.feedItemId = feedItemId;
    }
}
