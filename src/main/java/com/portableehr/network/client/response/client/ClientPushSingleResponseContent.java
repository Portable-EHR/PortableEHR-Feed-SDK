/*
 * Copyright © Portable EHR inc, 2024
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.Client;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.client.response.FeedHubApiResponse;

import java.util.UUID;

/**
 * The response to the /backend/client call
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {@link Client}
 * }
 * </code></pre>
 */
public class ClientPushSingleResponseContent {

    @JsonProperty("backendItemId")
    private UUID backendItemId = null;

    @JsonProperty("backendItem")
    private Object backendItem = null;

    public ClientPushSingleResponseContent() {
    }

    public ClientPushSingleResponseContent(UUID backendItemId, Object backendItem) {
        this.backendItemId = backendItemId;
        this.backendItem = backendItem;
    }

    public UUID getBackendItemId() {
        return backendItemId;
    }

    public void setBackendItemId(UUID backendItemId) {
        this.backendItemId = backendItemId;
    }

    public Object getBackendItem() {
        return backendItem;
    }

    public void setBackendItem(Object backendItem) {
        this.backendItem = backendItem;
    }
}
