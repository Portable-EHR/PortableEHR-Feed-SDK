/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.server;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Any of the following contact types :<br><br>
 * <b>self</b> : The person to contact about the client is the client himself.<br>
 * <b>guardian</b> : The person to contact about the client is a guardian of the client.<br>
 */
public enum ContactTypeEnum {
  SELF("self"),
  GUARDIAN("guardian");

  private String value;

  ContactTypeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ContactTypeEnum fromValue(String text) {
    for (ContactTypeEnum b : ContactTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
