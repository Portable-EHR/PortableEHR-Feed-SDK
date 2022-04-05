/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.server.Client;

import java.util.List;

/**
 * The responseContent attribute for the ${@link ClientPullResponse} to the /client
 * FeedHub request with "command": "pullBundle"
 * <pre><code>
 * {
 *     "offset": 0,
 *     "hasMore": false,
 *     "results": [
 *       {@link Client}1,
 *       {@link Client}2,
 *       ...
 *       {@link Client}N,
 *     ]
 *   }
 * </code></pre>
 */
public class ClientPullBundleResponseContent extends ClientPullResponseContent {

    @JsonProperty("offset")
    private int offset;

    @JsonProperty("hasMore")
    private boolean hasMore;

    @JsonProperty("results")
    private List<Client> results = null;

    public ClientPullBundleResponseContent() {
    }

    public ClientPullBundleResponseContent(int offset, boolean hasMore, List<Client> results) {
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

    public List<Client> getResults() {
        return results;
    }

    public void setResults(List<Client> results) {
        this.results = results;
    }
}
