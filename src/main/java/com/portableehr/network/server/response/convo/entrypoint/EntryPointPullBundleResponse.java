/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.convo.entrypoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.response.FeedApiResponse;
import com.portableehr.network.server.response.appointment.AppointmentPullBundleResponseContent;
import com.portableehr.network.server.response.appointment.AppointmentPullResponseContent;

/**
 * Response to the /feed/convo/entrypoint request by FeedHub
 * <pre><code>
 * {
 *   "requestStatus": {@link com.portableehr.network.ApiStatus},
 *   "responseContent": {@link EntryPointPullBundleResponseContent}
 * }
 * </code></pre>
 */
public class EntryPointPullBundleResponse extends FeedApiResponse {

    @JsonProperty("responseContent")
    private EntryPointPullBundleResponseContent responseContent = null;


    public EntryPointPullBundleResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(EntryPointPullBundleResponseContent responseContent) {
        this.responseContent = responseContent;
    }

}
