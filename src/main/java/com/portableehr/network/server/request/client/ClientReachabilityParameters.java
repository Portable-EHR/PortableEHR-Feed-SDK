/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.request.FeedHubRequestParameters;

/**
 * The parameters for the {@link ClientReachabilityRequest}
 * <pre><code>
 * {
 *     "patientId": "00000000-0000-0000-0000-000000000000",
 *     "isReachable": true
 * }
 * </code></pre>
 */
public class ClientReachabilityParameters extends FeedHubRequestParameters {

    @JsonProperty("patientId")
    private String clientId = null;

    @JsonProperty("isReachable")
    private boolean isReachable;

    public ClientReachabilityParameters() {
    }

    public ClientReachabilityParameters(String clientId, boolean isReachable) {
        this.clientId = clientId;
        this.isReachable = isReachable;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public boolean getIsReachable() {
        return isReachable;
    }

    public void setIsReachable(boolean reachable) {
        isReachable = reachable;
    }
}
