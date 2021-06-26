/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.server;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Any of the following appointment confirmation status :<br><br>
 * <b>pending</b> : The appointment status is not determined yet.<br>
 * <b>confirmed</b> : The appointment has been confirmed.<br>
 * <b>cancelled</b> : The appointment has been cancelled.<br>
 */
public enum AppointmentConfirmationStatusEnum {
  PENDING("pending"),
  CONFIRMED("confirmed"),
  CANCELLED("cancelled");

  private String value;

  AppointmentConfirmationStatusEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AppointmentConfirmationStatusEnum fromValue(String text) {
    for (AppointmentConfirmationStatusEnum b : AppointmentConfirmationStatusEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
