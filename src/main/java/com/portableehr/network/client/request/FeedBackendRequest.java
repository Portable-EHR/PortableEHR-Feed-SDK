/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;

/**
 * Class containing the minimum information sent on every request to FeedHub. Most request extend this class
 * with specifics parameters, but not all.
 * <pre><code>
 * {
 *      "feedAlias": "fiktivDP",
 *      "command": "pullBundle"
 *      "parameters": ...
 * }
 * </code></pre>
 */
public class FeedBackendRequest implements RequestToFeedHub {
    @JsonProperty("feedAlias")
    private String feedAlias = null;

    @JsonProperty("command")
    private RequestCommand command = null;

    @JsonProperty("parameters")
    protected Object parameters = null;

    public FeedBackendRequest() {
    }

    public FeedBackendRequest(String feedAlias, RequestCommand command) {
        this.feedAlias = feedAlias;
        this.command = command;
    }

    public FeedBackendRequest(String feedAlias, RequestCommand command, Object parameters) {
        this.feedAlias = feedAlias;
        this.command = command;
        this.parameters = parameters;
    }

    public String getFeedAlias() {
        return feedAlias;
    }

    public void setFeedAlias(String feedAlias) {
        this.feedAlias = feedAlias;
    }

    public RequestCommand getCommand() {
        return command;
    }

    public void setCommand(RequestCommand command) {
        this.command = command;
    }

    public Object getParameters() {
        return parameters;
    }

    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

}
