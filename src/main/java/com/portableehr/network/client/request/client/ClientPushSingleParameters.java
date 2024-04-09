/*
 * Copyright © Portable EHR inc, 2024
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.client;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.portableehr.model.Client;

/**
 * The parameters add a client
 * <pre><code>
 * Serializes as {@link Client}
 * </code></pre>
 */
public class ClientPushSingleParameters {

    @JsonUnwrapped
    private Client client;

    public ClientPushSingleParameters() {
    }

    public ClientPushSingleParameters(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
