/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.patient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.server.Patient;

import java.util.List;

/**
 * The responseContent attribute for the ${@link PatientPullResponse} to the /patient
 * FeedHub request with "command": "pullBundle"
 * <pre><code>
 * {
 *     "offset": 0,
 *     "hasMore": false,
 *     "results": [
 *       {@link Patient}1,
 *       {@link Patient}2,
 *       ...
 *       {@link Patient}N,
 *     ]
 *   }
 * </code></pre>
 */
public class PatientPullBundleResponseContent extends PatientPullResponseContent {

    @JsonProperty("offset")
    private int offset;

    @JsonProperty("hasMore")
    private boolean hasMore;

    @JsonProperty("results")
    private List<Patient> results = null;

    public PatientPullBundleResponseContent() {
    }

    public PatientPullBundleResponseContent(int offset, boolean hasMore, List<Patient> results) {
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

    public List<Patient> getResults() {
        return results;
    }

    public void setResults(List<Patient> results) {
        this.results = results;
    }
}
