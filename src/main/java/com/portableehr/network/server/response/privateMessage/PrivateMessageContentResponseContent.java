/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.privateMessage;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.portableehr.model.PrivateMessageContent;
import com.portableehr.network.server.response.FeedApiResponseContent;

/**
 * The responseContent attribute for the {@link PrivateMessageContentResponse}
 * <pre><code>
 * Serializes as a {@link PrivateMessageContent}
 * </code></pre>
 */
public class PrivateMessageContentResponseContent extends FeedApiResponseContent {

    @JsonUnwrapped
    PrivateMessageContent privateMessageContent;

    public PrivateMessageContentResponseContent() {
    }

    public PrivateMessageContentResponseContent(PrivateMessageContent privateMessageContent) {
        this.privateMessageContent = privateMessageContent;
    }

    public PrivateMessageContent getPrivateMessageContent() {
        return privateMessageContent;
    }

    public void setPrivateMessageContent(PrivateMessageContent privateMessageContent) {
        this.privateMessageContent = privateMessageContent;
    }
}
