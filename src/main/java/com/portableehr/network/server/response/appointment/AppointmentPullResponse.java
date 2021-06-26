/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.appointment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.response.FeedApiResponse;

/**
 * Response to the /feed/appointment request by FeedHub
 * <pre><code>
 * {
 *   "requestStatus": {@link com.portableehr.network.ApiStatus},
 *   "responseContent": {@link AppointmentPullBundleResponseContent}
 * }
 * </code></pre>
 */
public class AppointmentPullResponse extends FeedApiResponse {

    @JsonProperty("responseContent")
    private AppointmentPullResponseContent responseContent = null;


    public AppointmentPullResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(AppointmentPullResponseContent responseContent) {
        this.responseContent = responseContent;
    }

}
