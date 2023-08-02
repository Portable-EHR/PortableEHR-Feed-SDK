/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The reminder will be sent via : <br><br>
 * <b>email</b> : An email will be sent as reminder<br>
 * <b>sms</b> : A sms will be sent as reminder<br>
 * <b>in_convo</b> : A message will be sent in the conversation as reminder<br>
 */
public enum ReminderMethodEnum {
  EMAIL("email"),
  SMS("sms"),
  IN_CONVO("in_convo");

  private String value;

  ReminderMethodEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReminderMethodEnum fromValue(String text) {
    for (ReminderMethodEnum b : ReminderMethodEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
