/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request;

import com.fasterxml.jackson.annotation.JsonProperty;

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
    private String command = null;

    @JsonProperty("parameters")
    private FeedBackendRequestParameters parameters = null;

    public FeedBackendRequest() {
    }

    public FeedBackendRequest(String feedAlias, String command) {
        this.feedAlias = feedAlias;
        this.command = command;
    }

    public FeedBackendRequest(String feedAlias, String command, FeedBackendRequestParameters parameters) {
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

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public FeedBackendRequestParameters getParameters() {
        return parameters;
    }

    public void setParameters(FeedBackendRequestParameters parameters) {
        this.parameters = parameters;
    }

}
