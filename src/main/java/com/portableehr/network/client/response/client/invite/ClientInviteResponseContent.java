/*
 * Copyright © Portable EHR inc, 2024
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.client.invite;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.BackendClient;
import com.portableehr.network.server.request.FeedItemError;
import com.portableehr.network.server.request.FeedItemStatusUpdateResponseContent;

import java.util.List;
import java.util.UUID;

/**
 * The response content to the /backend/client [pushSingle] call
 * If the request method was QRCODE then:
 * <pre><code>
 * {
 *   "guid": "00000000-0000-0000-0000-000000000000",
 *   "data": "A base 64 encoded QR Code png"
 * }
 * </code></pre>
 *
 * Else it will be empty
 */
public class ClientInviteResponseContent extends FeedItemStatusUpdateResponseContent {

    @JsonProperty("guid")
    private UUID guid = null;

    @JsonProperty("data")
    private String data = null;

    public ClientInviteResponseContent() {
    }

    public UUID getGuid() {
        return guid;
    }

    public void setGuid(UUID guid) {
        this.guid = guid;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
