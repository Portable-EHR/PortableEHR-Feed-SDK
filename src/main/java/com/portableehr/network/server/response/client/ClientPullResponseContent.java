/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.client;

import com.portableehr.network.server.response.FeedApiResponseContent;

/**
 * Superclass for he responseContent attribute in {@link ClientPullResponse}<br>
 * Subclasses:<br>
 * {@link ClientPullSingleResponseContent}
 * {@link ClientPullBundleResponseContent}
 */
public abstract class ClientPullResponseContent extends FeedApiResponseContent {
}
