/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.client.response.FeedHubApiResponse;

/**
 * The response to the /backend/client/reachability call
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {@link ClientReachabilityResponseContent}
 * }
 * </code></pre>
 */
public class ClientReachabilityResponse extends FeedHubApiResponse {

    @JsonProperty("responseContent")
    private ClientReachabilityResponseContent responseContent = null;

    public ClientReachabilityResponse() {
    }

    public ClientReachabilityResponse(ApiStatus requestStatus, ClientReachabilityResponseContent responseContent) {
        super(requestStatus, responseContent);
        this.responseContent = responseContent;
    }

    @Override
    public ClientReachabilityResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(ClientReachabilityResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
