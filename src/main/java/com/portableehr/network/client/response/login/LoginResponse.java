/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.client.response.FeedHubApiResponse;
import com.portableehr.network.client.response.FeedHubApiResponseContent;

/**
 * Response to the /login call
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {@link LoginResponseContent}
 * }
 * </code></pre>
 */
public class LoginResponse extends FeedHubApiResponse {

    @JsonProperty("responseContent")
    private LoginResponseContent responseContent = null;

    public LoginResponse() {
    }

    public LoginResponse(ApiStatus requestStatus, FeedHubApiResponseContent responseContent, LoginResponseContent responseContent1) {
        super(requestStatus, responseContent);
        this.responseContent = responseContent1;
    }

    @Override
    public LoginResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(LoginResponseContent responseContent) {
        this.responseContent = responseContent;
    }


}
