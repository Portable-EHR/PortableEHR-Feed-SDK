/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.staff;

import com.portableehr.network.server.response.FeedApiResponseContent;

/**
 * Superclass for the responseContent attribute for the {@link StaffPullResponse}<br>
 * Subclasses:<br>
 * {@link StaffPullSingleResponseContent}
 * {@link StaffPullBundleResponseContent}
 */
public abstract class StaffPullResponseContent extends FeedApiResponseContent {
}
