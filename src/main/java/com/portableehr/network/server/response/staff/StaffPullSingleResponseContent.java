/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.staff;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.portableehr.model.server.Staff;

/**
 * The responseContent attribute for the ${@link StaffPullResponse} to the /staff
 * FeedHub request with "command": "pullSingle"
 * <pre><code>
 * Serializes as {@link Staff}
 * </code></pre>
 */
public class StaffPullSingleResponseContent extends StaffPullResponseContent {

    @JsonUnwrapped
    Staff result = null;

    public StaffPullSingleResponseContent() {
    }

    public StaffPullSingleResponseContent(Staff result) {
        this.result = result;
    }

    public Staff getResult() {
        return result;
    }

    public void setResult(Staff result) {
        this.result = result;
    }
}
