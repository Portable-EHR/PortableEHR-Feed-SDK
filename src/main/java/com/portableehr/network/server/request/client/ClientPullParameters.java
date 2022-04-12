/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.client;

import com.portableehr.network.server.request.FeedHubRequestParameters;

/**
 * Superclass for the parameters send by FeedHub in {@link ClientPullRequest}
 * Subclasses:<br>
 * {@link ClientPullSingleParameters}<br>
 * {@link ClientPullBundleParameters}<br>
 */
public abstract class ClientPullParameters extends FeedHubRequestParameters {
}