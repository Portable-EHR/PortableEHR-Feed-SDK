/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request;

/**
 * Superclass for the parameters in the {@link FeedHubRequest}<br>
 * Subclasses:<br>
 * {@link com.portableehr.network.server.request.patient.PatientPullParameters}
 * {@link com.portableehr.network.server.request.patient.PatientReachabilityParameters}
 * {@link com.portableehr.network.server.request.appointment.AppointmentPullRequest}
 * {@link com.portableehr.network.server.request.appointment.AppointmentDispositionRequest}
 * {@link com.portableehr.network.server.request.practitioner.PractitionerPullParameters}
 * {@link com.portableehr.network.server.request.privateMessage.PrivateMessageStatusParameters}
 */
public abstract class FeedHubRequestParameters {
}
