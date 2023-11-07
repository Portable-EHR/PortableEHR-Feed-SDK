/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.reminder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.PushBundleItemResponse;
import com.portableehr.network.client.response.FeedHubApiResponse;

import java.util.List;

/**
 * The response to the /backend/reminder call
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": [{@link PushBundleItemResponse}]
 * }
 * </code></pre>
 */
public class ReminderPushBundleResponse extends FeedHubApiResponse {

    @JsonProperty("responseContent")
    private List<PushBundleItemResponse> responseContent = null;

    public ReminderPushBundleResponse() {
    }

    public ReminderPushBundleResponse(ApiStatus requestStatus, List<PushBundleItemResponse> responseContent) {
        super(requestStatus, responseContent);
        this.responseContent = responseContent;
    }

    @Override
    public List<PushBundleItemResponse> getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(List<PushBundleItemResponse> responseContent) {
        this.responseContent = responseContent;
    }
}
