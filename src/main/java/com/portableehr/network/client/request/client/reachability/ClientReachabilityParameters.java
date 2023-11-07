/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.client.reachability;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters to sent in the client reachability.
 * <pre><code>
 * {
 *      "clientId": "00000000-0000-0000-0000-000000000000"
 * }
 * </code></pre>
 */
public class ClientReachabilityParameters {

    @JsonProperty("clientId")
    private String clientId = null;

    public ClientReachabilityParameters() {
    }

    public ClientReachabilityParameters(String clientId) {
        this.clientId = clientId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
