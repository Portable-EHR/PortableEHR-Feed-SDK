/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.patient;

import com.portableehr.network.server.request.FeedHubRequestParameters;

/**
 * Superclass for the parameters send by FeedHub in {@link PatientPullRequest}
 * Subclasses:<br>
 * {@link PatientPullSingleParameters}<br>
 * {@link PatientPullBundleParameters}<br>
 */
public abstract class PatientPullParameters extends FeedHubRequestParameters {
}
