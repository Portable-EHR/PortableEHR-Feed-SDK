/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.idIssuers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.client.response.FeedHubApiResponse;

/**
 * Response to the /backend/idissuers request.
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {@link IdIssuersResponseContent}
 * }
 * </code></pre>
 */
public class IdIssuersResponse extends FeedHubApiResponse {

    @JsonProperty("responseContent")
    private IdIssuersResponseContent responseContent = null;

    public IdIssuersResponse() {
    }

    public IdIssuersResponse(ApiStatus requestStatus, IdIssuersResponseContent responseContent) {
        super(requestStatus, responseContent);
        this.responseContent = responseContent;
    }

    @Override
    public IdIssuersResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(IdIssuersResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
