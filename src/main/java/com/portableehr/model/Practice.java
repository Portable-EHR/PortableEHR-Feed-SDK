/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.UUID;

/**
 * Practice
 * <pre><code>
 * {
 *    "feedItemId": "00000000-0000-0000-0000-000000000000",
 *    "backendItemId": "00000000-0000-0000-0000-000000000000",
 *    "issuerKind": {@link LicenseIssuerKindEnum},
 *    "issuerAlias": "CA_QC_CMQ",
 *    "issuer": "CMQ",
 *    "number": "112488",
 *    "version": "2",
 *    "expiresOn": "2021-01-28",
 *    "isActive": false
 * }
 * </code></pre>
 */
public class Practice   {
  @JsonProperty("feedItemId")
  private UUID feedItemId = null;

  @JsonProperty("backendItemId")
  private UUID backendItemId = null;

  @JsonProperty("issuerKind")
  private LicenseIssuerKindEnum issuerKind = null;

  @JsonProperty("issuerAlias")
  private String issuerAlias = null;

  @JsonProperty("issuer")
  private String issuer = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("expiresOn")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date expiresOn = null;

  @JsonProperty("isActive")
  private Boolean isActive = null;

  public Practice() {
  }

  public Practice(UUID feedItemId, UUID backendItemId, LicenseIssuerKindEnum issuerKind, String issuerAlias, String issuer, String number, String version, Date expiresOn, Boolean isActive) {
    this.feedItemId = feedItemId;
    this.backendItemId = backendItemId;
    this.issuerKind = issuerKind;
    this.issuerAlias = issuerAlias;
    this.issuer = issuer;
    this.number = number;
    this.version = version;
    this.expiresOn = expiresOn;
    this.isActive = isActive;
  }

  public UUID getFeedItemId() {
    return feedItemId;
  }

  public void setFeedItemId(UUID feedItemId) {
    this.feedItemId = feedItemId;
  }

  public UUID getBackendItemId() {
    return backendItemId;
  }

  public void setBackendItemId(UUID backendItemId) {
    this.backendItemId = backendItemId;
  }

  public LicenseIssuerKindEnum getIssuerKind() {
    return issuerKind;
  }

  public void setIssuerKind(LicenseIssuerKindEnum issuerKind) {
    this.issuerKind = issuerKind;
  }

  public String getIssuerAlias() {
    return issuerAlias;
  }

  public void setIssuerAlias(String issuerAlias) {
    this.issuerAlias = issuerAlias;
  }

  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Date getExpiresOn() {
    return expiresOn;
  }

  public void setExpiresOn(Date expiresOn) {
    this.expiresOn = expiresOn;
  }

  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean active) {
    isActive = active;
  }
}
