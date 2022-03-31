/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.request.staff.StaffPullRequest;

/**
 * Superclass containing the common attributes sent by most of FeedHub's requests
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pushSingle",
 *   "parameters": {@link FeedHubRequestParameters}
 * }
 * </code></pre>
 * Subclasses:<br>
 * {@link com.portableehr.network.server.request.appointment.AppointmentDispositionRequest}
 * {@link com.portableehr.network.server.request.appointment.AppointmentPullRequest}
 * {@link com.portableehr.network.server.request.patient.PatientPullRequest}
 * {@link com.portableehr.network.server.request.patient.PatientReachabilityRequest}
 * {@link com.portableehr.network.server.request.staff.StaffPullRequest}
 * {@link com.portableehr.network.server.request.privateMessage.PrivateMessageStatusRequest}
 * {@link com.portableehr.network.server.request.privateMessage.PrivateMessageContentRequest}
 */
public abstract class FeedHubRequest {

    @JsonProperty("feedAlias")
    private String feedAlias = null;

    @JsonProperty("command")
    private String command = null;

    @JsonProperty("parameters")
    private FeedHubRequestParameters parameters = null;

    public FeedHubRequest() {
    }

    public FeedHubRequest(String feedAlias, String command) {
        this.feedAlias = feedAlias;
        this.command = command;
    }

    public FeedHubRequest(String feedAlias, String command, FeedHubRequestParameters parameters) {
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

    public FeedHubRequestParameters getParameters() {
        return parameters;
    }

    public void setParameters(FeedHubRequestParameters parameters) {
        this.parameters = parameters;
    }
}
