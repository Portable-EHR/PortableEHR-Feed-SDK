/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.convo.entrypoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.convo.LocationEntryPoint;
import com.portableehr.network.server.response.FeedApiResponseContent;
import com.portableehr.network.server.response.appointment.AppointmentPullResponse;

import java.util.List;

/**
 * The responseContent attribute for the ${@link AppointmentPullResponse} to the /appointment
 * FeedHub request with "command": "pullBundle"
 * <pre><code>
 * {
 *     "results": [
 *       {@link LocationEntryPoint}1,
 *       {@link LocationEntryPoint}2,
 *       ...
 *       {@link LocationEntryPoint}N,
 *     ]
 *   }
 * </code></pre>
 */
public class EntryPointPullBundleResponseContent extends FeedApiResponseContent {

    @JsonProperty("results")
    private List<LocationEntryPoint> results = null;

    public EntryPointPullBundleResponseContent() {
    }

    public EntryPointPullBundleResponseContent(List<LocationEntryPoint> results) {
        this.results = results;
    }

    public List<LocationEntryPoint> getResults() {
        return results;
    }

    public void setResults(List<LocationEntryPoint> results) {
        this.results = results;
    }
}

