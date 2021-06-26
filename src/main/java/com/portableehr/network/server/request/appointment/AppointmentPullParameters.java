/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.appointment;

import com.portableehr.network.server.request.FeedHubRequestParameters;

/**
 * Superclass for the parameters send by FeedHub in {@link AppointmentPullRequest}
 * Subclasses:<br>
 * {@link AppointmentPullSingleParameters}<br>
 * {@link AppointmentPullBundleParameters}<br>
 */
public abstract class AppointmentPullParameters extends FeedHubRequestParameters {
}
