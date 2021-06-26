/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.privateMessage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.server.response.FeedApiResponse;
import com.portableehr.network.server.response.FeedApiResponseContent;

/**
 * The response to the FeedHub /feed/privateMessage/content.
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {@link PrivateMessageContentResponseContent}
 * }
 * </code></pre>
 */
public class PrivateMessageContentResponse extends FeedApiResponse {

    @JsonProperty("responseContent")
    private PrivateMessageContentResponseContent responseContent = null;

    public PrivateMessageContentResponse() {
    }

    public PrivateMessageContentResponse(ApiStatus requestStatus, FeedApiResponseContent responseContent, PrivateMessageContentResponseContent responseContent1) {
        super(requestStatus, responseContent);
        this.responseContent = responseContent1;
    }

    @Override
    public PrivateMessageContentResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(PrivateMessageContentResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
