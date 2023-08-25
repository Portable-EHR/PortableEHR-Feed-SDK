/*
 * Copyright © Portable EHR inc, 2023
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.client.invite;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.ClientInviteMethodEnum;
import com.portableehr.network.client.request.FeedBackendRequestParameters;

/**
 * The parameters to invite a client to install and activate the app.
 * <pre><code>
 * {
 *      "clientId": "00000000-0000-0000-0000-000000000000"
 *      "method" : {@link ClientInviteMethodEnum}
 * }
 * </code></pre>
 */
public class ClientInviteParameters extends FeedBackendRequestParameters {

    @JsonProperty("clientId")
    private String clientId = null;

    @JsonProperty("method")
    private ClientInviteMethodEnum method;

    public ClientInviteParameters() {
    }

    public ClientInviteParameters(String clientId, ClientInviteMethodEnum method) {
        this.clientId = clientId;
        this.method = method;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public ClientInviteMethodEnum getMethod() {
        return method;
    }

    public void setMethod(ClientInviteMethodEnum method) {
        this.method = method;
    }
}
