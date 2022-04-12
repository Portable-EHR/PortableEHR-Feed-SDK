/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Any of the following appointment location :<br><br>
 * <b>clinic</b> : An appointment at the clinic of the practitioner.<br>
 * <b>home</b> : An appointment at the home of the patient.<br>
 * <b>video</b> : A videoconferencing appointment.<br>
 * <b>telephone</b> : A telephone appointment.<br>
 */
public enum AppointmentLocationEnum {
  CLINIC("clinic"),
  HOME("home"),
  VIDEO("video"),
  TELEPHONE("telephone");

  private String value;

  AppointmentLocationEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AppointmentLocationEnum fromValue(String text) {
    for (AppointmentLocationEnum b : AppointmentLocationEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
