/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.client.response.FeedHubApiResponseContent;

/**
 * The responseContent field in {@link LoginResponse}
 * <pre><code>
 * {
 *   "token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtp..."
 * }
 * </code></pre>
 */
public class LoginResponseContent extends FeedHubApiResponseContent {

    @JsonProperty("token")
    private String token = null;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
