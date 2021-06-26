/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.practitioner;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.portableehr.model.server.Practitioner;

/**
 * The responseContent attribute for the ${@link PractitionerPullResponse} to the /practitioner
 * FeedHub request with "command": "pullSingle"
 * <pre><code>
 * Serializes as {@link Practitioner}
 * </code></pre>
 */
public class PractitionerPullSingleResponseContent extends PractitionerPullResponseContent {

    @JsonUnwrapped
    Practitioner result = null;

    public PractitionerPullSingleResponseContent() {
    }

    public PractitionerPullSingleResponseContent(Practitioner result) {
        this.result = result;
    }

    public Practitioner getResult() {
        return result;
    }

    public void setResult(Practitioner result) {
        this.result = result;
    }
}
