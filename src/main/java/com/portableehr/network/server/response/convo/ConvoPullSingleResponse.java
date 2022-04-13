/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.convo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.server.response.FeedApiResponse;
import com.portableehr.network.server.response.FeedApiResponseContent;

/**
 * The response to the FeedHub /feed/convo [pullSingle] request
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {@link ConvoPullSingleResponseContent}
 * }
 * </code></pre>
 */
public class ConvoPullSingleResponse extends FeedApiResponse {

    @JsonProperty("responseContent")
    private ConvoPullSingleResponseContent responseContent = null;

    public ConvoPullSingleResponse() {
    }

    public ConvoPullSingleResponse(ApiStatus requestStatus, FeedApiResponseContent responseContent, ConvoPullSingleResponseContent responseContent1) {
        super(requestStatus, responseContent);
        this.responseContent = responseContent1;
    }

    @Override
    public ConvoPullSingleResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(ConvoPullSingleResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
