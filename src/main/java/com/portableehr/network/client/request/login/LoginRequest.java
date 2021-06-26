/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.login;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.client.request.RequestToFeedHub;

/**
 * Request sent to FeedHub to obtain a authentication token.
 * <pre><code>
 * {
 *    "username": "DrGueritout",
 *    "password": "kU8Gnu6Gw8_9JwUC=14lK"
 * }
 * </code></pre>
 */
public class LoginRequest implements RequestToFeedHub {
  @JsonProperty("username")
  private String username = null;

  @JsonProperty("password")
  private String password = null;

  public LoginRequest() {
  }

  public LoginRequest(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
