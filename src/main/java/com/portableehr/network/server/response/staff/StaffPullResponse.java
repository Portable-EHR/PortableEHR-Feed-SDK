/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.staff;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.response.FeedApiResponse;

/**
 * Response to the FeedHub /feed/staff request
 * <pre><code>
 * {
 *   "requestStatus": {@link com.portableehr.network.ApiStatus},
 *   "responseContent": {@link StaffPullResponseContent}
 * }
 * </code></pre>
 */
public class StaffPullResponse extends FeedApiResponse {

    @JsonProperty("responseContent")
    private StaffPullResponseContent responseContent = null;


    public StaffPullResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(StaffPullResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
