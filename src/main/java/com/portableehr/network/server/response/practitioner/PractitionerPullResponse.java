/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.practitioner;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.response.FeedApiResponse;

/**
 * Response to the FeedHub /feed/practitioner request
 * <pre><code>
 * {
 *   "requestStatus": {@link com.portableehr.network.ApiStatus},
 *   "responseContent": {@link PractitionerPullResponseContent}
 * }
 * </code></pre>
 */
public class PractitionerPullResponse extends FeedApiResponse {

    @JsonProperty("responseContent")
    private PractitionerPullResponseContent responseContent = null;


    public PractitionerPullResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(PractitionerPullResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
