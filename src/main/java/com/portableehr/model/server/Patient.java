/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.server;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Patient
 * <pre><code>
 * {
 *     "feedAlias": "fiktivDP",
 *     "feedItemId": ""00000000-0000-0000-0000-000000000000",
 *     "backendItemId": "00000000-0000-0000-0000-000000000000",
 *     "lastUpdated": "2021-01-14T23:41:21.050Z",
 *     "feedItemVersion": 1,
 *     "chartNumber": "H008",
 *     "primaryFeedPractitionerId": "00000000-0000-0000-0000-000000000000",
 *     "demographics": {@link Demographics},
 *     "identifiedBy": [
 *       {@link PatientLegitId}1,
 *       {@link PatientLegitId}2,
 *       ...
 *       {@link PatientLegitId}N,
 *     ],
 *     "locatedWith": {@link PatientLocatedWith}
 * }
 * </code></pre>
 */
public class Patient {

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

  @JsonProperty("chartNumber")
  private String chartNumber = null;

  @JsonProperty("primaryFeedPractitionerId")
  private String primaryFeedPractitionerId = null;

  @JsonProperty("demographics")
  private Demographics demographics = null;

  @JsonProperty("identifiedBy")
  private List<PatientLegitId> identifiedBy = new ArrayList<>();

  @JsonProperty("locatedWith")
  private PatientLocatedWith locatedWith = null;

  public Patient() {
  }

  public Patient(String feedAlias, UUID feedItemId, UUID backendItemId, Date lastUpdated, Integer feedItemVersion,
                 String chartNumber, String primaryFeedPractitionerId, Demographics demographics,
                 List<PatientLegitId> identifiedBy, PatientLocatedWith locatedWith) {
    this.feedAlias = feedAlias;
    this.feedItemId = feedItemId;
    this.backendItemId = backendItemId;
    this.lastUpdated = lastUpdated;
    this.feedItemVersion = feedItemVersion;
    this.chartNumber = chartNumber;
    this.primaryFeedPractitionerId = primaryFeedPractitionerId;
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

  public String getChartNumber() {
    return chartNumber;
  }

  public void setChartNumber(String chartNumber) {
    this.chartNumber = chartNumber;
  }

  public String getPrimaryFeedPractitionerId() {
    return primaryFeedPractitionerId;
  }

  public void setPrimaryFeedPractitionerId(String primaryFeedPractitionerId) {
    this.primaryFeedPractitionerId = primaryFeedPractitionerId;
  }

  public Demographics getDemographics() {
    return demographics;
  }

  public void setDemographics(Demographics demographics) {
    this.demographics = demographics;
  }

  public List<PatientLegitId> getIdentifiedBy() {
    return identifiedBy;
  }

  public void setIdentifiedBy(List<PatientLegitId> identifiedBy) {
    this.identifiedBy = identifiedBy;
  }

  public PatientLocatedWith getLocatedWith() {
    return locatedWith;
  }

  public void setLocatedWith(PatientLocatedWith locatedWith) {
    this.locatedWith = locatedWith;
  }
}
