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
public class PatientReachability {
  @JsonProperty("patientId")
  private String patientId = null;

  @JsonProperty("isReachable")
  private Boolean isReachable = null;

  public PatientReachability patientId(String patientId) {
    this.patientId = patientId;
    return this;
  }

  public String getPatientId() {
    return patientId;
  }

  public void setPatientId(String patientId) {
    this.patientId = patientId;
  }

  public Boolean getIsReachable() {
    return isReachable;
  }

  public void setIsReachable(Boolean reachable) {
    isReachable = reachable;
  }
}
