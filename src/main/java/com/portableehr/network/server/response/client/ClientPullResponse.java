/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.response.FeedApiResponse;

/**
 * Response to the FeedHub /feed/client request
 * <pre><code>
 * {
 *   "requestStatus": {@link com.portableehr.network.ApiStatus},
 *   "responseContent": {@link ClientPullResponseContent}
 * }
 * </code></pre>
 */
public class ClientPullResponse extends FeedApiResponse {

    @JsonProperty("responseContent")
    private ClientPullResponseContent responseContent = null;


    public ClientPullResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(ClientPullResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
