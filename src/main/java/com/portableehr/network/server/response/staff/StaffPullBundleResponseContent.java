/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.staff;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.server.Staff;

import java.util.List;

/**
 * The responseContent attribute for the ${@link StaffPullResponse} to the /staff
 * FeedHub request with "command": "pullBundle"
 * <pre><code>
 * {
 *     "offset": 0,
 *     "hasMore": false,
 *     "results": [
 *       {@link Staff}1,
 *       {@link Staff}2,
 *       ...
 *       {@link Staff}N,
 *     ]
 *   }
 * </code></pre>
 */
public class StaffPullBundleResponseContent extends StaffPullResponseContent {

    @JsonProperty("offset")
    private int offset;

    @JsonProperty("hasMore")
    private boolean hasMore;

    @JsonProperty("results")
    private List<Staff> results = null;

    public StaffPullBundleResponseContent() {
    }

    public StaffPullBundleResponseContent(int offset, boolean hasMore, List<Staff> results) {
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

    public List<Staff> getResults() {
        return results;
    }

    public void setResults(List<Staff> results) {
        this.results = results;
    }
}
