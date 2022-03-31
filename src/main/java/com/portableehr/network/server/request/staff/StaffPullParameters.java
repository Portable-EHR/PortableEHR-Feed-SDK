/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.staff;

import com.portableehr.network.server.request.FeedHubRequestParameters;

/**
 * Superclass for the parameters send by FeedHub in {@link StaffPullRequest}
 * Subclasses:<br>
 * {@link StaffPullSingleParameters}<br>
 * {@link StaffPullBundleParameters}<br>
 */
public abstract class StaffPullParameters extends FeedHubRequestParameters {
}
