/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request;

import com.portableehr.network.server.request.client.ClientPullParameters;
import com.portableehr.network.server.request.client.ClientReachabilityParameters;
import com.portableehr.network.server.request.staff.StaffPullParameters;

/**
 * Superclass for the parameters in the {@link FeedHubRequest}<br>
 * Subclasses:<br>
 * {@link ClientPullParameters}
 * {@link ClientReachabilityParameters}
 * {@link com.portableehr.network.server.request.appointment.AppointmentPullRequest}
 * {@link com.portableehr.network.server.request.appointment.AppointmentDispositionRequest}
 * {@link StaffPullParameters}
 * {@link com.portableehr.network.server.request.privateMessage.PrivateMessageStatusParameters}
 */
public abstract class FeedHubRequestParameters {
}
