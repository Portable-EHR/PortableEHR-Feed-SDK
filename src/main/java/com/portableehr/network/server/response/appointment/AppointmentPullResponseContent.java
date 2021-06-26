/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.appointment;

import com.portableehr.network.server.response.FeedApiResponseContent;

/**
 * Superclass for the responseContent for {@link AppointmentPullResponse}<br>
 * Subclasses:
 * {@link AppointmentPullSingleResponseContent}
 * {@link AppointmentPullBundleResponseContent}
 */
public abstract class AppointmentPullResponseContent extends FeedApiResponseContent {
}
