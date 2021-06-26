/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.response.FeedApiResponseContent;

/**
 * The responseContent attribute in the {@link LoginResponse}
 * <pre><code>
 * {
 *      "token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtp..."
 * }
 * </code></pre>
 */
public class LoginResponseContent extends FeedApiResponseContent {

    @JsonProperty("token")
    private String token = null;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
