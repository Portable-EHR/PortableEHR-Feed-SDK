/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Client
 * <pre><code>
 * {
 *     "feedAlias": "fiktivDP",
 *     "feedItemId": ""00000000-0000-0000-0000-000000000000",
 *     "backendItemId": "00000000-0000-0000-0000-000000000000",
 *     "lastUpdated": "2021-01-14T23:41:21.050Z",
 *     "feedItemVersion": 1,
 *     "profileNumber": "H008",
 *     "demographics": {@link Demographics},
 *     "identifiedBy": [
 *       {@link ClientLegitId}1,
 *       {@link ClientLegitId}2,
 *       ...
 *       {@link ClientLegitId}N,
 *     ],
 *     "locatedWith": {@link ClientLocatedWith}
 * }
 * </code></pre>
 */
public class Client {

  @JsonProperty("feedAlias")
  private String feedAlias = null;

  @JsonProperty("feedItemId")
  private UUID feedItemId = null;

  @JsonProperty("backendItemId")
  private UUID backendItemId = null;

  @JsonProperty("lastUpdated")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
  private Date lastUpdated = null;

  @JsonProperty("feedItemVersion")
  private Integer feedItemVersion = null;

  @JsonProperty("profileNumber")
  private String profileNumber = null;

  @JsonProperty("identityValidated")
  private Boolean identityValidated = null;

  @JsonProperty("demographics")
  private Demographics demographics = null;

  @JsonProperty("identifiedBy")
  private List<ClientLegitId> identifiedBy = new ArrayList<>();

  @JsonProperty("locatedWith")
  private ClientLocatedWith locatedWith = null;

  public Client() {
  }

  public Client(String feedAlias, UUID feedItemId, UUID backendItemId, Date lastUpdated, Integer feedItemVersion,
                String profileNumber, Boolean identityValidated, Demographics demographics, List<ClientLegitId> identifiedBy, ClientLocatedWith locatedWith) {
    this.feedAlias = feedAlias;
    this.feedItemId = feedItemId;
    this.backendItemId = backendItemId;
    this.lastUpdated = lastUpdated;
    this.feedItemVersion = feedItemVersion;
    this.profileNumber = profileNumber;
    this.identityValidated = identityValidated;
    this.demographics = demographics;
    this.identifiedBy = identifiedBy;
    this.locatedWith = locatedWith;
  }

  public String getFeedAlias() {
    return feedAlias;
  }

  public void setFeedAlias(String feedAlias) {
    this.feedAlias = feedAlias;
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

  public Date getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public Integer getFeedItemVersion() {
    return feedItemVersion;
  }

  public void setFeedItemVersion(Integer feedItemVersion) {
    this.feedItemVersion = feedItemVersion;
  }

  public String getProfileNumber() {
    return profileNumber;
  }

  public void setProfileNumber(String profileNumber) {
    this.profileNumber = profileNumber;
  }

  public Boolean getIdentityValidated() {
    return identityValidated;
  }

  public void setIdentityValidated(Boolean identityValidated) {
    this.identityValidated = identityValidated;
  }

  public Demographics getDemographics() {
    return demographics;
  }

  public void setDemographics(Demographics demographics) {
    this.demographics = demographics;
  }

  public List<ClientLegitId> getIdentifiedBy() {
    return identifiedBy;
  }

  public void setIdentifiedBy(List<ClientLegitId> identifiedBy) {
    this.identifiedBy = identifiedBy;
  }

  public ClientLocatedWith getLocatedWith() {
    return locatedWith;
  }

  public void setLocatedWith(ClientLocatedWith locatedWith) {
    this.locatedWith = locatedWith;
  }
}
