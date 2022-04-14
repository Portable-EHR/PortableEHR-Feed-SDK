/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.convo.entry;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.server.response.FeedApiResponse;
import com.portableehr.network.server.response.FeedApiResponseContent;
import com.portableehr.network.server.response.convo.ConvoPushSingleResponseContent;

/**
 * The response to the FeedHub /feed/convo/entry [pushSingle] request
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {@link EntryPushSingleResponseContent}
 * }
 * </code></pre>
 */
public class EntryPushSingleResponse extends FeedApiResponse {

    @JsonProperty("responseContent")
    private EntryPushSingleResponseContent responseContent = null;

    public EntryPushSingleResponse() {
    }

    public EntryPushSingleResponse(ApiStatus requestStatus, FeedApiResponseContent responseContent, EntryPushSingleResponseContent responseContent1) {
        super(requestStatus, responseContent);
        this.responseContent = responseContent1;
    }

    @Override
    public EntryPushSingleResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(EntryPushSingleResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
