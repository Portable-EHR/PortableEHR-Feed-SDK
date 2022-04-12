/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status of the conversation : <br><br>
 * <b>open</b> : The conversation is ongoing<br>
 * <b>closed</b> : The conversation has benn closed<br>
 */
public enum ConversationStatusEnum {
  OPEN("open"),
  CLOSED("closed");

  private String value;

  ConversationStatusEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversationStatusEnum fromValue(String text) {
    for (ConversationStatusEnum b : ConversationStatusEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
