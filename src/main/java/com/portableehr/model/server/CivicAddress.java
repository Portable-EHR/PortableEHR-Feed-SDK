/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Civic address for the Patient.
 * <pre><code>
 * {
 *    "street1": "1000 Park Avenue, #200",
 *    "street2": "In the cupboard, under the staircase.",
 *    "city": "Montreal",
 *    "state": "QC",
 *    "zip": "H0H 0H0",
 *    "country": {@link Country}
 * }
 * </code></pre>
 */
public class CivicAddress   {
  @JsonProperty("street1")
  private String street1 = null;

  @JsonProperty("street2")
  private String street2 = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("zip")
  private String zip = null;

  @JsonProperty("country")
  private Country country = null;

  public CivicAddress() {
  }

  public CivicAddress(String street1, String street2, String city, String state, String zip, Country country) {
    this.street1 = street1;
    this.street2 = street2;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.country = country;
  }

  public String getStreet1() {
    return street1;
  }

  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  public String getStreet2() {
    return street2;
  }

  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }
}
