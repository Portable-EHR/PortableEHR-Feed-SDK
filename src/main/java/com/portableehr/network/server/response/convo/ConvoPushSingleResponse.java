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
 * The response to the FeedHub /feed/convo [pushSingle] request
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {@link ConvoPushSingleResponseContent}
 * }
 * </code></pre>
 */
public class ConvoPushSingleResponse extends FeedApiResponse {

    @JsonProperty("responseContent")
    private ConvoPushSingleResponseContent responseContent = null;

    public ConvoPushSingleResponse() {
    }

    public ConvoPushSingleResponse(ApiStatus requestStatus, FeedApiResponseContent responseContent, ConvoPushSingleResponseContent responseContent1) {
        super(requestStatus, responseContent);
        this.responseContent = responseContent1;
    }

    @Override
    public ConvoPushSingleResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(ConvoPushSingleResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
