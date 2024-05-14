/*
 * Copyright © Portable EHR inc, 2024
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.Client;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.client.response.FeedHubApiResponse;
import com.portableehr.network.server.request.FeedItemError;
import com.portableehr.network.server.request.FeedItemStatusUpdateResponseContent;

import java.util.List;
import java.util.UUID;

/**
 * The response to the /backend/client [pushSingle] call
 * <pre><code>
 * {
 *   "backendItemId": "00000000-0000-0000-0000-000000000000",
 *   "backendItem": TODO
 * }
 * </code></pre>
 */
public class ClientPushSingleResponseContent extends FeedItemStatusUpdateResponseContent {

    @JsonProperty("backendItemId")
    private UUID backendItemId = null;

    @JsonProperty("backendItem")
    private Object backendItem = null;

    public ClientPushSingleResponseContent() {
    }

    public ClientPushSingleResponseContent(List<FeedItemError> errors, UUID backendItemId, Object backendItem) {
        super(errors);
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
