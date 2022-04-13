/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PatientReachability
 * <pre><code>
 * {
 *    "patientId": "00000000-0000-0000-0000-000000000000",
 *    "isReachable": true
 * }
 * </code></pre>
 */
public class ClientReachability {
  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("isReachable")
  private Boolean isReachable = null;

  public ClientReachability patientId(String patientId) {
    this.clientId = patientId;
    return this;
  }

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Boolean getIsReachable() {
    return isReachable;
  }

  public void setIsReachable(Boolean reachable) {
    isReachable = reachable;
  }
}
