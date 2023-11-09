/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.convo.Entry;

import java.util.UUID;

/**
 * The parameters for the {@link ConvoPushSingleRequest}
 * <pre><code>
 * {
 *     "entry": {@link Entry}, // The first entry in the conversation
 *     "locationEntryPointId": true, // Where the new conversation is starting
 * }
 * </code></pre>
 */
public class ConvoPushSingleParameters {

    @JsonProperty("entry")
    private Entry entry = null;

    @JsonProperty("locationEntryPointId")
    private UUID locationEntryPointId = null;

    @JsonProperty("clientId")
    private UUID clientId = null;

    @JsonProperty("clientTitle")
    private String clientTitle = null;

    public ConvoPushSingleParameters() {
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    public UUID getLocationEntryPointId() {
        return locationEntryPointId;
    }

    public void setLocationEntryPointId(UUID locationEntryPointId) {
        this.locationEntryPointId = locationEntryPointId;
    }

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public String getClientTitle() {
        return clientTitle;
    }

    public void setClientTitle(String clientTitle) {
        this.clientTitle = clientTitle;
    }
}
