/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.practitioner;

import com.portableehr.network.server.response.FeedApiResponseContent;

/**
 * Superclass for the responseContent attribute for the {@link PractitionerPullResponse}<br>
 * Subclasses:<br>
 * {@link com.portableehr.network.server.response.practitioner.PractitionerPullSingleResponseContent}
 * {@link com.portableehr.network.server.response.practitioner.PractitionerPullBundleResponseContent}
 */
public abstract class PractitionerPullResponseContent extends FeedApiResponseContent {
}
