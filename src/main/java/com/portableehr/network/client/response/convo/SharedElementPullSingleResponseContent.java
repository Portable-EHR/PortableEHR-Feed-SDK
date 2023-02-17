/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.convo;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.portableehr.model.convo.EntryEnvelop;
import com.portableehr.model.convo.shared.SharedPrivateMessage;
import com.portableehr.network.client.response.FeedHubApiResponseContent;

/**
 * The responseContent field for {@link SharedElementPullSingleResponse}<br><br>
 * Serialized as a {@link SharedPrivateMessage}
 */
public class SharedElementPullSingleResponseContent extends FeedHubApiResponseContent {

    @JsonUnwrapped
    private SharedPrivateMessage privateMessage = null;

    public SharedElementPullSingleResponseContent() {
    }

    public SharedElementPullSingleResponseContent(SharedPrivateMessage privateMessage) {
        this.privateMessage = privateMessage;
    }

    public SharedPrivateMessage getPrivateMessage() {
        return privateMessage;
    }

    public void setPrivateMessage(SharedPrivateMessage privateMessage) {
        this.privateMessage = privateMessage;
    }
}
