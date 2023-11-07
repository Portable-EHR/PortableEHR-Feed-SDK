/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * ReminderTrigger
 * <pre><code>
 * {
 *    "date": "2021-01-14T23:41:21.050Z",
 *    "hint": "Whatever the feed needs to know what to do when this trigger gets triggered. I.E. A key word, a JSON"
 * }
 * </code></pre>
 */
public class ReminderTrigger {
  @JsonProperty("date")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
  private Date date = null;

  @JsonProperty("hint")
  private String hint = null;

  public ReminderTrigger() {
  }

  public ReminderTrigger(Date date, String hint) {
    this.date = date;
    this.hint = hint;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getHint() {
    return hint;
  }

  public void setHint(String hint) {
    this.hint = hint;
  }
}
