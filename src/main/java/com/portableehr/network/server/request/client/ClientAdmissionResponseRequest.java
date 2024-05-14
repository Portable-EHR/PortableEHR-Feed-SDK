/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.client;

import com.portableehr.network.RequestCommand;
import com.portableehr.network.server.request.ApiResponseRequest;
import com.portableehr.network.server.request.FeedItemStatusUpdate;

/**
 * Request sent by FeedHub to update the feed on the status of a client admission
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pushSingle",
 *   "parameters": {@link ClientAdmissionStatusUpdate}
 * }
 * </code></pre>
 */
public class ClientAdmissionResponseRequest extends ApiResponseRequest {

    public ClientAdmissionResponseRequest() {}

    public ClientAdmissionResponseRequest(String feedAlias, RequestCommand command, ClientAdmissionStatusUpdate parameters) {
        super(feedAlias, command, parameters);
    }

    public ClientAdmissionStatusUpdate getParameters() {
        return (ClientAdmissionStatusUpdate) parameters;
    }

    public void setParameters(ClientAdmissionStatusUpdate parameters) {
        this.parameters = parameters;
    }

}
