/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.client;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.portableehr.model.ClientReachability;
import com.portableehr.network.client.response.FeedHubApiResponseContent;

/**
 * The responseContent field for {@link ClientReachabilityResponse}<br><br>
 * Serialized as a {@link ClientReachability}
 */
public class ClientReachabilityResponseContent extends FeedHubApiResponseContent {

    @JsonUnwrapped
    private ClientReachability clientReachability = null;

    public ClientReachabilityResponseContent() {
    }

    public ClientReachabilityResponseContent(ClientReachability clientReachability) {
        this.clientReachability = clientReachability;
    }

    public ClientReachability getPatientReachability() {
        return clientReachability;
    }

    public void setPatientReachability(ClientReachability clientReachability) {
        this.clientReachability = clientReachability;
    }
}
