/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * What is this entry about : <br><br>
 * <b>message</b> : The entry is a message (text, attachment, or both)<br>
 * <b>status-change</b> : The entry is about a status change in the conversation<br>
 * <b>move</b> : The entry is about the conversation changing location<br>
 * <b>participant</b> : The entry is about adding or removing a participant<br>
 * <b>assign</b> : The entry is about assigning someone as admin<br>
 */
public enum EntryTypeEnum {
  MESSAGE("message"),
  STATUS_CHANGE("status-change"),
  MOVE("move"),
  PARTICIPANT("participant"),
  ASSIGN("assign");

  private String value;

  EntryTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EntryTypeEnum fromValue(String text) {
    for (EntryTypeEnum b : EntryTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
