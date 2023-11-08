/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Reminder
 * <pre><code>
 * {
 *    "feedItemId": "00000000-0000-0000-0000-000000000000",
 *    "status": "00000000-0000-0000-0000-000000000000",
 *    "aboutType": "feed object type",
 *    "aboutId": "00000000-0000-0000-0000-000000000000",
 *    "triggers": [
 *      {@link ReminderTrigger},
 *      ...,
 *      {@link ReminderTrigger}
 *    ],
 *
 * }
 * </code></pre>
 */
public class Reminder {
  @JsonProperty("feedItemId")
  private String feedItemId = null;

  @JsonProperty("status")
  private ReminderStatusEnum status = null;

  @JsonProperty("aboutType")
  private String aboutType = null;

  @JsonProperty("aboutId")
  private String aboutId = null;

  @JsonProperty("triggers")
  private List<ReminderTrigger> triggers = new ArrayList<>();

  public Reminder() {
  }

  public Reminder(String feedItemId, ReminderStatusEnum status, String aboutType, String aboutId, List<ReminderTrigger> triggers) {
    this.feedItemId = feedItemId;
    this.status = status;
    this.aboutType = aboutType;
    this.aboutId = aboutId;
    this.triggers = triggers;
  }

  public String getFeedItemId() {
    return feedItemId;
  }

  public void setFeedItemId(String feedItemId) {
    this.feedItemId = feedItemId;
  }

  public ReminderStatusEnum getStatus() {
    return status;
  }

  public void setStatus(ReminderStatusEnum status) {
    this.status = status;
  }

  public String getAboutType() {
    return aboutType;
  }

  public void setAboutType(String aboutType) {
    this.aboutType = aboutType;
  }

  public String getAboutId() {
    return aboutId;
  }

  public void setAboutId(String aboutId) {
    this.aboutId = aboutId;
  }

  public List<ReminderTrigger> getTriggers() {
    return triggers;
  }

  public void setTriggers(List<ReminderTrigger> triggers) {
    this.triggers = triggers;
  }
}
