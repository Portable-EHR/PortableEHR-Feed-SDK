/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.patient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.response.FeedApiResponse;

/**
 * Response to the FeedHub /feed/patient request
 * <pre><code>
 * {
 *   "requestStatus": {@link com.portableehr.network.ApiStatus},
 *   "responseContent": {@link PatientPullResponseContent}
 * }
 * </code></pre>
 */
public class PatientPullResponse extends FeedApiResponse {

    @JsonProperty("responseContent")
    private PatientPullResponseContent responseContent = null;


    public PatientPullResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(PatientPullResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
