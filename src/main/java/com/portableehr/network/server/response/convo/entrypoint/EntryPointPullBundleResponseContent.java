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
 *     "offset": 0,
 *     "hasMore": false,
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

    @JsonProperty("offset")
    private int offset;

    @JsonProperty("hasMore")
    private boolean hasMore;

    @JsonProperty("results")
    private List<LocationEntryPoint> results = null;

    public EntryPointPullBundleResponseContent() {
    }

    public EntryPointPullBundleResponseContent(int offset, boolean hasMore, List<LocationEntryPoint> results) {
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

    public List<LocationEntryPoint> getResults() {
        return results;
    }

    public void setResults(List<LocationEntryPoint> results) {
        this.results = results;
    }
}

