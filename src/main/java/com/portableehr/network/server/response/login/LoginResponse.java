/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.response.FeedApiResponse;

/**
 * Response to the FeedHub /login request
 * <pre><code>
 * {
 *   "requestStatus": {@link com.portableehr.network.ApiStatus},
 *   "responseContent": {@link LoginResponseContent}
 * }
 * </code></pre>
 */
public class LoginResponse extends FeedApiResponse {

    @JsonProperty("responseContent")
    private LoginResponseContent responseContent = null;

    @Override
    public LoginResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(LoginResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
