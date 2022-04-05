/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.server;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.IdIssuerKindEnum;

import java.util.Date;
import java.util.UUID;

/**
 * ClientLegitId
 * <pre><code>
 * {
 *    "feedItemId": "00000000-0000-0000-0000-000000000000",
 *    "backendItemId": "00000000-0000-0000-0000-000000000000",
 *    "issuerKind": {@link IdIssuerKindEnum},
 *    "issuerAlias": "CA_QC_RAMQ",
 *    "number": "SMIJ55041507",
 *    "version": "2",
 *    "expiresOn": "2021-01-28"
 * }
 * </code></pre>
 */
public class ClientLegitId {

  @JsonProperty("feedItemId")
  private UUID feedItemId = null;

  @JsonProperty("backendItemId")
  private UUID backendItemId = null;

  @JsonProperty("issuerKind")
  private IdIssuerKindEnum issuerKind = null;

  @JsonProperty("issuerAlias")
  private String issuerAlias = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("expiresOn")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date expiresOn = null;

  public ClientLegitId() {
  }

  public ClientLegitId(UUID feedItemId, UUID backendItemId, IdIssuerKindEnum issuerKind, String issuerAlias, String number, String version, Date expiresOn) {
    this.feedItemId = feedItemId;
    this.backendItemId = backendItemId;
    this.issuerKind = issuerKind;
    this.issuerAlias = issuerAlias;
    this.number = number;
    this.version = version;
    this.expiresOn = expiresOn;
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

  public IdIssuerKindEnum getIssuerKind() {
    return issuerKind;
  }

  public void setIssuerKind(IdIssuerKindEnum issuerKind) {
    this.issuerKind = issuerKind;
  }

  public String getIssuerAlias() {
    return issuerAlias;
  }

  public void setIssuerAlias(String issuerAlias) {
    this.issuerAlias = issuerAlias;
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
}
