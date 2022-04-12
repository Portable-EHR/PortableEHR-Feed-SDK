/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.client;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.portableehr.model.Client;

/**
 * The responseContent attribute for the ${@link ClientPullResponse} to the /client
 * FeedHub request with "command": "pullSingle"
 * <pre><code>
 * Serializes as {@link Client}
 * </code></pre>
 */
public class ClientPullSingleResponseContent extends ClientPullResponseContent {

    @JsonUnwrapped
    Client result = null;

    public ClientPullSingleResponseContent() {
    }

    public ClientPullSingleResponseContent(Client client) {
        this.result = client;
    }

    public Client getResult() {
        return result;
    }

    public void setResult(Client result) {
        this.result = result;
    }
}
