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
 * Appointment
 * <pre><code>
 * {
 *     "feedAlias": "fiktivDP",
 *     "feedItemId": "00000000-0000-0000-0000-000000000000",
 *     "backendItemId": "00000000-0000-0000-0000-000000000000",
 *     "lastUpdated": "2021-01-14T23:41:21.050Z",
 *     "feedItemVersion": 1,
 *     "id": "00000000-0000-0000-0000-000000000000",
 *     "patientId": "00000000-0000-0000-0000-000000000000",
 *     "practitionerId": "00000000-0000-0000-0000-000000000000",
 *     "location": {@link AppointmentLocationEnum},
 *     "with": "Smith, John, Edward",
 *     "startTime": "2021-05-15T15:15:00Z",
 *     "endTime": "2021-05-15T15:25:00Z",
 *     "description": "Covid-19 vaccine appointment",
 *     "notes": "Must be alive. #app",
 *     "patientMustConfirm": true,
 *     "confirmationStatus": {@link AppointmentConfirmationStatusEnum}
 * }
 * </code></pre>
 */
public class Appointment {
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
  private String id = null;

  @JsonProperty("patientId")
  private String patientId = null;

  @JsonProperty("practitionerId")
  private String practitionerId = null;

  @JsonProperty("location")
  private AppointmentLocationEnum location = null;

  @JsonProperty("with")
  private String with = null;

  @JsonProperty("startTime")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
  private Date startTime = null;

  @JsonProperty("endTime")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
  private Date endTime = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("patientMustConfirm")
  private Boolean patientMustConfirm = null;

  @JsonProperty("confirmationStatus")
  private AppointmentConfirmationStatusEnum confirmationStatus = null;

  public Appointment() {
  }

  public Appointment(String feedAlias, UUID feedItemId, UUID backendItemId, Date lastUpdated, Integer feedItemVersion,
                     String id, String patientId, String practitionerId, AppointmentLocationEnum location, String with,
                     Date startTime, Date endTime, String description, String notes, Boolean patientMustConfirm,
                     AppointmentConfirmationStatusEnum confirmationStatus) {
    this.feedAlias = feedAlias;
    this.feedItemId = feedItemId;
    this.backendItemId = backendItemId;
    this.lastUpdated = lastUpdated;
    this.feedItemVersion = feedItemVersion;
    this.id = id;
    this.patientId = patientId;
    this.practitionerId = practitionerId;
    this.location = location;
    this.with = with;
    this.startTime = startTime;
    this.endTime = endTime;
    this.description = description;
    this.notes = notes;
    this.patientMustConfirm = patientMustConfirm;
    this.confirmationStatus = confirmationStatus;
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

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPatientId() {
    return patientId;
  }

  public void setPatientId(String patientId) {
    this.patientId = patientId;
  }

  public String getPractitionerId() {
    return practitionerId;
  }

  public void setPractitionerId(String practitionerId) {
    this.practitionerId = practitionerId;
  }

  public AppointmentLocationEnum getLocation() {
    return location;
  }

  public void setLocation(AppointmentLocationEnum location) {
    this.location = location;
  }

  public String getWith() {
    return with;
  }

  public void setWith(String with) {
    this.with = with;
  }

  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Boolean getPatientMustConfirm() {
    return patientMustConfirm;
  }

  public void setPatientMustConfirm(Boolean patientMustConfirm) {
    this.patientMustConfirm = patientMustConfirm;
  }

  public AppointmentConfirmationStatusEnum getConfirmationStatus() {
    return confirmationStatus;
  }

  public void setConfirmationStatus(AppointmentConfirmationStatusEnum confirmationStatus) {
    this.confirmationStatus = confirmationStatus;
  }
}
