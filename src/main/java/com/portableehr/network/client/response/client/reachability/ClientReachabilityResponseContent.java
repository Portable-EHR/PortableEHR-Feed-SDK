/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.client.reachability;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.portableehr.model.ClientReachability;

/**
 * The responseContent field for {@link ClientReachabilityResponse}<br><br>
 * Serialized as a {@link ClientReachability}
 */
public class ClientReachabilityResponseContent {

    @JsonUnwrapped
    private ClientReachability clientReachability = null;

    public ClientReachabilityResponseContent() {
    }

    public ClientReachabilityResponseContent(ClientReachability clientReachability) {
        this.clientReachability = clientReachability;
    }

    public ClientReachability getClientReachability() {
        return clientReachability;
    }

    public void setClientReachability(ClientReachability clientReachability) {
        this.clientReachability = clientReachability;
    }
}
