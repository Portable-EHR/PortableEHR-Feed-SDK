/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.practitioner;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.server.Practitioner;

import java.util.List;

/**
 * The responseContent attribute for the ${@link PractitionerPullResponse} to the /practitioner
 * FeedHub request with "command": "pullBundle"
 * <pre><code>
 * {
 *     "offset": 0,
 *     "hasMore": false,
 *     "results": [
 *       {@link Practitioner}1,
 *       {@link Practitioner}2,
 *       ...
 *       {@link Practitioner}N,
 *     ]
 *   }
 * </code></pre>
 */
public class PractitionerPullBundleResponseContent extends PractitionerPullResponseContent {

    @JsonProperty("offset")
    private int offset;

    @JsonProperty("hasMore")
    private boolean hasMore;

    @JsonProperty("results")
    private List<Practitioner> results = null;

    public PractitionerPullBundleResponseContent() {
    }

    public PractitionerPullBundleResponseContent(int offset, boolean hasMore, List<Practitioner> results) {
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

    public List<Practitioner> getResults() {
        return results;
    }

    public void setResults(List<Practitioner> results) {
        this.results = results;
    }
}
