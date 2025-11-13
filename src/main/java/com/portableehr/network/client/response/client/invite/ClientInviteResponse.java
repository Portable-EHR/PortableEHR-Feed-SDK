/*
 * Copyright © Portable EHR inc, 2023
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.client.invite;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.client.response.FeedHubApiResponse;

/**
 * The response to the /backend/client/invite call
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {@link ClientInviteResponseContent}
 * }
 * </code></pre>
 */
public class ClientInviteResponse extends FeedHubApiResponse {
    @JsonProperty("responseContent")
    private ClientInviteResponseContent responseContent = null;

    public ClientInviteResponse() {
    }

    public ClientInviteResponse(ApiStatus requestStatus, ClientInviteResponseContent responseContent) {
        super(requestStatus, responseContent);
        this.responseContent = responseContent;
    }

    @Override
    public ClientInviteResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(ClientInviteResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
