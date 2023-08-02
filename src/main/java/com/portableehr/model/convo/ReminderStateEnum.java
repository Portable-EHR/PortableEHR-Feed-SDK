/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The state of the reminder : <br><br>
 * <b>enabled</b> : The reminder is enabled and will be sent when reached the specified date<br>
 * <b>disabled</b> : The reminder was disabled by an action (like sending a reply)<br>
 * <b>canceled</b> : The reminder was canceled manually by the author<br>
 * <b>sent</b> : The reminder was sent<br>
 */
public enum ReminderStateEnum {
  ENABLED("enabled"),
  DISABLED("disabled"),
  CANCELED("canceled"),
  SENT("sent");

  private String value;

  ReminderStateEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReminderStateEnum fromValue(String text) {
    for (ReminderStateEnum b : ReminderStateEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
