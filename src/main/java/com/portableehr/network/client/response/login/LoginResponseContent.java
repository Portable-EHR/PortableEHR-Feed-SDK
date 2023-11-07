/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.login;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The responseContent field in {@link LoginResponse}
 * <pre><code>
 * {
 *   "token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImtp..."
 * }
 * </code></pre>
 */
public class LoginResponseContent {

    @JsonProperty("token")
    private String token = null;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
