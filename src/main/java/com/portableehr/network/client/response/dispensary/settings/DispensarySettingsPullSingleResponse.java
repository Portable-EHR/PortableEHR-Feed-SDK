/*
 * Copyright © Portable EHR inc, 2024
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.dispensary.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.dispensary.Settings;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.client.response.FeedHubApiResponse;

/**
 * Response to the /backend/dispensary/settings pullSingle request.
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {@link Settings}
 * }
 * </code></pre>
 */
public class DispensarySettingsPullSingleResponse extends FeedHubApiResponse {

    @JsonProperty("responseContent")
    private Settings responseContent = null;

    public DispensarySettingsPullSingleResponse() {
    }

    public DispensarySettingsPullSingleResponse(ApiStatus requestStatus, Settings responseContent) {
        super(requestStatus, responseContent);
        this.responseContent = responseContent;
    }

    @Override
    public Settings getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(Settings responseContent) {
        this.responseContent = responseContent;
    }
}
