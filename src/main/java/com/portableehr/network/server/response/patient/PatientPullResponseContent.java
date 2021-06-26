/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.patient;

import com.portableehr.network.server.response.FeedApiResponseContent;

/**
 * Superclass for he responseContent attribute in {@link PatientPullResponse}<br>
 * Subclasses:<br>
 * {@link PatientPullSingleResponseContent}
 * {@link PatientPullBundleResponseContent}
 */
public abstract class PatientPullResponseContent extends FeedApiResponseContent {
}
