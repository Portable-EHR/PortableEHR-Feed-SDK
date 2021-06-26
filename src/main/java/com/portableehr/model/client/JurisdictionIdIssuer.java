/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.IdIssuerKindEnum;

import java.util.UUID;

/**
 * Jurisdiction dependent ID issuers known by the backend.
 * <pre><code>
 * {
 *    "issuerKind": "practiceLicense",
 *    "country": "CA",
 *    "state": "QC",
 *    "issuer": "CMQ",
 *    "issuerAlias": "CA_QC_CMQ",
 *    "description": "Collège des médecins du Québec",
 *    "guid": "00000000-0000-0000-0000-000000000000",
 *    "isTechnical": false,
 *    "officialWWWurl": "http://www.cmq.org/"
 * }
 * </code></pre>
 */
public class JurisdictionIdIssuer {

  @JsonProperty("issuerKind")
  private IdIssuerKindEnum issuerKind = null;

  @JsonProperty("country")
  private CountryEnum country = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("issuer")
  private String issuer = null;

  @JsonProperty("issuerAlias")
  private String issuerAlias = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("guid")
  private UUID guid = null;

  @JsonProperty("isTechnical")
  private Boolean isTechnical = null;

  @JsonProperty("officialWWWurl")
  private String officialWWWurl = null;

  public JurisdictionIdIssuer() {

  }

  public JurisdictionIdIssuer(IdIssuerKindEnum issuerKind, CountryEnum country, String state, String issuer, String issuerAlias, String description, UUID guid, Boolean isTechnical, String officialWWWurl) {
    this.issuerKind = issuerKind;
    this.country = country;
    this.state = state;
    this.issuer = issuer;
    this.issuerAlias = issuerAlias;
    this.description = description;
    this.guid = guid;
    this.isTechnical = isTechnical;
    this.officialWWWurl = officialWWWurl;
  }

  public IdIssuerKindEnum getIssuerKind() {
    return issuerKind;
  }

  public void setIssuerKind(IdIssuerKindEnum issuerKind) {
    this.issuerKind = issuerKind;
  }

  public CountryEnum getCountry() {
    return country;
  }

  public void setCountry(CountryEnum country) {
    this.country = country;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public String getIssuerAlias() {
    return issuerAlias;
  }

  public void setIssuerAlias(String issuerAlias) {
    this.issuerAlias = issuerAlias;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UUID getGuid() {
    return guid;
  }

  public void setGuid(UUID guid) {
    this.guid = guid;
  }

  public Boolean getIsTechnical() {
    return isTechnical;
  }

  public void setIsTechnical(Boolean technical) {
    isTechnical = technical;
  }

  public String getOfficialWWWurl() {
    return officialWWWurl;
  }

  public void setOfficialWWWurl(String officialWWWurl) {
    this.officialWWWurl = officialWWWurl;
  }
}
