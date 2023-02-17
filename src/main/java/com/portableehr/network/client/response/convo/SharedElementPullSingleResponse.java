/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.convo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.client.response.FeedHubApiResponse;

/**
 * The response to the /backend/convo/entry/shared
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {@link SharedElementPullSingleResponseContent}
 * }
 * </code></pre>
 */
public class SharedElementPullSingleResponse extends FeedHubApiResponse {

    @JsonProperty("responseContent")
    private SharedElementPullSingleResponseContent responseContent = null;

    public SharedElementPullSingleResponse() {
    }

    public SharedElementPullSingleResponse(ApiStatus requestStatus, SharedElementPullSingleResponseContent responseContent) {
        super(requestStatus, responseContent);
        this.responseContent = responseContent;
    }

    @Override
    public SharedElementPullSingleResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(SharedElementPullSingleResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
