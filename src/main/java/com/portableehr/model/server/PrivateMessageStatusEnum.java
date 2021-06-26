/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.server;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Status of the private message : <br><br>
 * <b>received</b> : Portable EHR has received notification of a new private message to be transmitted to a patient.<br>
 * <b>reminded</b> : A reminder SMS has been sent to the patient mobile device.
 *                   This happens if a configurable amount of time (say, 10 minutes) has passed since the private message
 *                   notification has reached the patient mobile device and the patient hasn't seen the private message content yet.<br>
 * <b>notified</b> : Portable EHR has notified the patient of a new private message being available.<br>
 * <b>sent</b> : Portable EHR has forwarded the private message content to the patient mobile device.<br>
 * <b>seen</b> : The private message content has been seen by the patient.<br>
 * <b>acknowledged</b> : The patient has acknowledged the reception of the private message content.<br>
 * <b>fallback</b> : An email message has been sent to the person legally in charge of caring for this message to reach the patient.
 *                   It happens if a configurable amount of time (say, 48 hours) has passed since the private message notification
 *                   has reached the patient mobile device and the patient hasn't seen the private message content yet.<br>
 * <b>failed</b> : The private message delivery has failed. This state is reached right after fallback state.<br>
 */
public enum PrivateMessageStatusEnum {
  RECEIVED("received"),
  REMINDED("reminded"),
  NOTIFIED("notified"),
  SENT("sent"),
  SEEN("seen"),
  ACKNOWLEDGED("acknowledged"),
  FALLBACK("fallback"),
  FAILED("failed");

  private String value;

  PrivateMessageStatusEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PrivateMessageStatusEnum fromValue(String text) {
    for (PrivateMessageStatusEnum b : PrivateMessageStatusEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
