/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.server;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.server.response.FeedApiResponseContent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Practitioner
 * <pre><code>
 * {
 *     "feedAlias": "fiktivDP",
 *     "feedItemId": "00000000-0000-0000-0000-000000000000",
 *     "backendItemId": "00000000-0000-0000-0000-000000000000",
 *     "lastUpdated": "2021-01-14T23:41:21.050Z",
 *     "feedItemVersion": 1,
 *     "id": "00000000-0000-0000-0000-000000000000",
 *     "firstName": "John",
 *     "lastName": "Smith",
 *     "middleName": "Edward",
 *     "practices": [
 *       {@link Practice}1,
 *       {@link Practice}2,
 *       ...
 *       {@link Practice}N,
 *     ]
 *   }
 * </code></pre>
 */
public class Practitioner {

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

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("practices")
  private List<Practice> practices = new ArrayList<Practice>();

  public Practitioner() {
  }

  public Practitioner(String feedAlias, UUID feedItemId, UUID backendItemId, Date lastUpdated, Integer feedItemVersion,
                      UUID id, String firstName, String lastName, String middleName, List<Practice> practices) {
    this.feedAlias = feedAlias;
    this.feedItemId = feedItemId;
    this.backendItemId = backendItemId;
    this.lastUpdated = lastUpdated;
    this.feedItemVersion = feedItemVersion;
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.middleName = middleName;
    this.practices = practices;
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

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public List<Practice> getPractices() {
    return practices;
  }

  public void setPractices(List<Practice> practices) {
    this.practices = practices;
  }
}
