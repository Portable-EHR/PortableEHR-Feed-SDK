/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.convo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.client.response.FeedHubApiResponse;

/**
 * The response to the /backend/convo/entry
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {@link ConversationEntryNotificationResponseContent}
 * }
 * </code></pre>
 */
public class ConversationEntryNotificationResponse extends FeedHubApiResponse {

    @JsonProperty("responseContent")
    private ConversationEntryNotificationResponseContent responseContent = null;

    public ConversationEntryNotificationResponse() {
    }

    public ConversationEntryNotificationResponse(ApiStatus requestStatus, ConversationEntryNotificationResponseContent responseContent) {
        super(requestStatus, responseContent);
        this.responseContent = responseContent;
    }

    @Override
    public ConversationEntryNotificationResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(ConversationEntryNotificationResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
