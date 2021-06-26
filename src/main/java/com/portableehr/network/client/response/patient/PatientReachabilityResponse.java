/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.patient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.client.response.FeedHubApiResponse;

/**
 * The response to the /backend/patient/reachability call
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {@link PatientReachabilityResponseContent}
 * }
 * </code></pre>
 */
public class PatientReachabilityResponse extends FeedHubApiResponse {

    @JsonProperty("responseContent")
    private PatientReachabilityResponseContent responseContent = null;

    public PatientReachabilityResponse() {
    }

    public PatientReachabilityResponse(ApiStatus requestStatus, PatientReachabilityResponseContent responseContent) {
        super(requestStatus, responseContent);
        this.responseContent = responseContent;
    }

    @Override
    public PatientReachabilityResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(PatientReachabilityResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
