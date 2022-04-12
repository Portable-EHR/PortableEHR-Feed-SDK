/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Disposition of the appointment : <br><br>
 * <b>patientConfirmed</b> : The patient has confirmed the appointment via Portable EHR mobile app.<br>
 * <b>patientUnconfirmed</b> : The patient has unconfirmed the appointment via Portable EHR mobile app.<br>
 * <b>patientCancelled</b> : The patient has cancelled the appointment via Portable EHR mobile app. <br>
 */
public enum AppointmentDispositionEnum {
  PATIENTCONFIRMED("patientConfirmed"),
  PATIENTUNCONFIRMED("patientUnconfirmed"),
  PATIENTCANCELLED("patientCancelled");

  private String value;

  AppointmentDispositionEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AppointmentDispositionEnum fromValue(String text) {
    for (AppointmentDispositionEnum b : AppointmentDispositionEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
