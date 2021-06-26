/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PatientDemographicsName
 * <pre><code>
 * {
 *    "familyName": "Taylor",
 *    "firstName": "Jane",
 *    "middleName": "Rose"
 * }
 * </code></pre>
 */
public class DemographicsName {
  @JsonProperty("familyName")
  private String familyName = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("middleName")
  private String middleName = null;

  public DemographicsName() {

  }

  public DemographicsName(String familyName, String firstName, String middleName) {
    this.familyName = familyName;
    this.firstName = firstName;
    this.middleName = middleName;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }
}
