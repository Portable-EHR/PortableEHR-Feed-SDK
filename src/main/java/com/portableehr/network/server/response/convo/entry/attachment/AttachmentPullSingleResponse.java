/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.convo.entry.attachment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.server.response.FeedApiResponse;
import com.portableehr.network.server.response.FeedApiResponseContent;

/**
 * The response to the FeedHub /feed/convo/entry/attachment [pullSingle] request
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {@link AttachmentPullSingleResponseContent}
 * }
 * </code></pre>
 */
public class AttachmentPullSingleResponse extends FeedApiResponse {

    @JsonProperty("responseContent")
    private AttachmentPullSingleResponseContent responseContent = null;

    public AttachmentPullSingleResponse() {
    }

    public AttachmentPullSingleResponse(ApiStatus requestStatus, FeedApiResponseContent responseContent, AttachmentPullSingleResponseContent responseContent1) {
        super(requestStatus, responseContent);
        this.responseContent = responseContent1;
    }

    @Override
    public AttachmentPullSingleResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(AttachmentPullSingleResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
