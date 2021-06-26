/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.practitioner;

import com.portableehr.network.server.request.FeedHubRequestParameters;

/**
 * Superclass for the parameters send by FeedHub in {@link PractitionerPullRequest}
 * Subclasses:<br>
 * {@link PractitionerPullSingleParameters}<br>
 * {@link PractitionerPullBundleParameters}<br>
 */
public abstract class PractitionerPullParameters extends FeedHubRequestParameters {
}
