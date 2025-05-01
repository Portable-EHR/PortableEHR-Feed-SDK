/*
 * Copyright © Portable EHR inc, 2025
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
 *     "backendPatientId": "00000000-0000-0000-0000-000000000000",
 *     "lastUpdated": "2021-01-14T23:41:21.050Z",
 *     "demographics": {@link Demographics},
 *     "identifiedBy": [
 *       {@link ClientLegitId}1,
 *       {@link ClientLegitId}2,
 *       ...
 *       {@link ClientLegitId}N,
 *     ],
 *     "locatedWith": {@link LocatedWith}
 * }
 * </code></pre>
 */
public class BackendClient {

  @JsonProperty("backendClientId")
  private UUID backendClientId = null;

  @JsonProperty("lastUpdated")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
  private Date lastUpdated = null;

  @JsonProperty("demographics")
  private Demographics demographics = null;

  @JsonProperty("identifiedBy")
  private List<ClientLegitId> identifiedBy = new ArrayList<>();

  @JsonProperty("locatedWith")
  private LocatedWith locatedWith = null;

  public BackendClient() {
  }

  public UUID getBackendClientId() {
    return backendClientId;
  }

  public void setBackendClientId(UUID backendClientId) {
    this.backendClientId = backendClientId;
  }

  public Date getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated = lastUpdated;
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

  public LocatedWith getLocatedWith() {
    return locatedWith;
  }

  public void setLocatedWith(LocatedWith locatedWith) {
    this.locatedWith = locatedWith;
  }
}
