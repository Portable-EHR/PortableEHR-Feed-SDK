/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.patient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * The parameters for the {@link PatientPullRequest} with "command": "pullBundle"
 * <pre><code>
 * {
 *     "since": "2020-11-13T22:46:55.313Z",
 *     "offset": 0,
 *     "maxItems": 1000,
 * }
 * </code></pre>
 */
public class PatientPullBundleParameters extends PatientPullParameters {

    @JsonProperty("since")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date since = null;

    @JsonProperty("offset")
    private int offset;

    @JsonProperty("maxItems")
    private int maxItems;

    public PatientPullBundleParameters() {
    }

    public PatientPullBundleParameters(Date since, int offset, int maxItems) {
        this.since = since;
        this.offset = offset;
        this.maxItems = maxItems;
    }

    public Date getSince() {
        return since;
    }

    public void setSince(Date since) {
        this.since = since;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }
}
