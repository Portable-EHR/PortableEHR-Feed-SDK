/*
 * Copyright © Portable EHR inc, 2024
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.client.response.FeedHubApiResponse;

/**
 * The response to the /backend/client call
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {@link ClientPushSingleResponseContent}
 * }
 * </code></pre>
 */
public class ClientPushSingleResponse extends FeedHubApiResponse {
    @JsonProperty("responseContent")
    private ClientPushSingleResponseContent responseContent = null;

    public ClientPushSingleResponse() {
    }

    public ClientPushSingleResponse(ApiStatus requestStatus, ClientPushSingleResponseContent responseContent) {
        super(requestStatus, responseContent);
        this.responseContent = responseContent;
    }

    @Override
    public ClientPushSingleResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(ClientPushSingleResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
