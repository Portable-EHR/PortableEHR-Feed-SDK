/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.server.request.appointment.AppointmentDispositionRequest;
import com.portableehr.network.server.request.appointment.AppointmentPullRequest;
import com.portableehr.network.server.request.client.ClientPullRequest;
import com.portableehr.network.server.request.client.ClientReachabilityRequest;
import com.portableehr.network.server.request.convo.ConvoPullSingleRequest;
import com.portableehr.network.server.request.convo.ConvoPushSingleRequest;
import com.portableehr.network.server.request.convo.entry.EntryPushSingleRequest;
import com.portableehr.network.server.request.convo.entry.attachment.AttachmentPullSingleRequest;
import com.portableehr.network.server.request.convo.entry.status.EntryStatusPushSingleRequest;
import com.portableehr.network.server.request.convo.entrypoint.EntryPointPullBundleRequest;
import com.portableehr.network.server.request.privateMessage.PrivateMessageContentRequest;
import com.portableehr.network.server.request.privateMessage.PrivateMessageStatusRequest;
import com.portableehr.network.server.request.staff.StaffPullRequest;

/**
 * Superclass containing the common attributes sent by most of FeedHub's requests
 * <pre><code>
 * {
 *   "feedAlias": "fiktivDP",
 *   "command": "pushSingle",
 *   "parameters": ...
 * }
 * </code></pre>
 * Subclasses:<br>
 * {@link AppointmentDispositionRequest}
 * {@link AppointmentPullRequest}
 * {@link ClientPullRequest}
 * {@link ClientReachabilityRequest}
 * {@link StaffPullRequest}
 * {@link PrivateMessageStatusRequest}
 * {@link PrivateMessageContentRequest}
 * {@link AttachmentPullSingleRequest}
 * {@link EntryStatusPushSingleRequest}
 * {@link EntryPushSingleRequest}
 * {@link EntryPointPullBundleRequest}
 * {@link ConvoPullSingleRequest}
 * {@link ConvoPushSingleRequest}
 */
public abstract class FeedHubRequest {

    @JsonProperty("feedAlias")
    private String feedAlias = null;

    @JsonProperty("command")
    private RequestCommand command = null;

    @JsonProperty("parameters")
    private Object parameters = null;

    public FeedHubRequest() {
    }

    public FeedHubRequest(String feedAlias, RequestCommand command) {
        this.feedAlias = feedAlias;
        this.command = command;
    }

    public FeedHubRequest(String feedAlias, RequestCommand command, Object parameters) {
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
