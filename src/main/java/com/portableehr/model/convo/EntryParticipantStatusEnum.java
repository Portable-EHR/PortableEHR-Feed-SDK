/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of the entry for a participant : <br><br>
 * <b>sent</b> : The entry was sent to the participant<br>
 * <b>received</b> : The entry was received by the participant<br>
 * <b>read</b> : The entry was read by the participant<br>
 * <b>akn</b> : The entry was acknowledged by the participant<br>
 */
public enum EntryParticipantStatusEnum {
  SENT("sent"),
  RECEIVED("received"),
  READ("read"),
  AKN("akn");

  private String value;

  EntryParticipantStatusEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EntryParticipantStatusEnum fromValue(String text) {
    for (EntryParticipantStatusEnum b : EntryParticipantStatusEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
