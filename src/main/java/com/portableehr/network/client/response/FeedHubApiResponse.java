/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.ApiStatus;

/**
 * Class containing the minimum information returned by FeedHub for any call. Most response extend this class
 * with specifics responseContent, but not all.
 * <pre><code>
 * {
 *      "requestStatus": {@link ApiStatus},
 *      "responseContent": ...
 * }
 * </code></pre>
 */
public class FeedHubApiResponse {
    @JsonProperty("requestStatus")
    private ApiStatus requestStatus = null;

    @JsonProperty("responseContent")
    private FeedHubApiResponseContent responseContent = null;

    public FeedHubApiResponse() {}

    public FeedHubApiResponse(ApiStatus requestStatus, FeedHubApiResponseContent responseContent) {
        this.requestStatus = requestStatus;
        this.responseContent = responseContent;
    }

    /**
     * Get requestStatus
     * @return requestStatus
     **/
    public ApiStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(ApiStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    /**
     * Get responseContent
     * @return responseContent
     **/
    public FeedHubApiResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(FeedHubApiResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
