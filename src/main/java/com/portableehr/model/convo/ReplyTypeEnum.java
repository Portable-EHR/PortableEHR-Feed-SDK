/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * What can be accepted as a reply to an entry : <br><br>
 * <b>free_text</b> : Participants can reply by typing a message<br>
 * <b>date</b> : Participants must choose a Date<br>
 * <b>date_time</b> : Participants must choose a Date and Time<br>
 * <b>choice</b> : Participants must choose from a set of PossibleReply <br>
 */
public enum ReplyTypeEnum {
  FREE_TEXT("free_text"),
  DATE("date"),
  DATE_TIME("date_time"),
  CHOICE("choice");

  private String value;

  ReplyTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReplyTypeEnum fromValue(String text) {
    for (ReplyTypeEnum b : ReplyTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
