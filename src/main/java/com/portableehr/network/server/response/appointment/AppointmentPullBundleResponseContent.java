/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.appointment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.server.Appointment;

import java.util.List;

/**
 * The responseContent attribute for the ${@link AppointmentPullResponse} to the /appointment
 * FeedHub request with "command": "pullBundle"
 * <pre><code>
 * {
 *     "offset": 0,
 *     "hasMore": false,
 *     "results": [
 *       {@link Appointment}1,
 *       {@link Appointment}2,
 *       ...
 *       {@link Appointment}N,
 *     ]
 *   }
 * </code></pre>
 */
public class AppointmentPullBundleResponseContent extends AppointmentPullResponseContent {

    @JsonProperty("offset")
    private int offset;

    @JsonProperty("hasMore")
    private boolean hasMore;

    @JsonProperty("results")
    private List<Appointment> results = null;

    public AppointmentPullBundleResponseContent() {
    }

    public AppointmentPullBundleResponseContent(int offset, boolean hasMore, List<Appointment> results) {
        this.offset = offset;
        this.hasMore = hasMore;
        this.results = results;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public List<Appointment> getResults() {
        return results;
    }

    public void setResults(List<Appointment> results) {
        this.results = results;
    }
}

