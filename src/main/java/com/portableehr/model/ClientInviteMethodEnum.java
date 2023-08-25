/*
 * Copyright © Portable EHR inc, 2023
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Any of the following invitation methods :<br><br>
 * <b>email</b> : The invitation will be sent via email.<br>
 * <b>sms</b> : The invitation will be sent via sms.<br>
 */
public enum ClientInviteMethodEnum {
  EMAIL("email"),
  SMS("sms");

  private String value;

  ClientInviteMethodEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ClientInviteMethodEnum fromValue(String text) {
    for (ClientInviteMethodEnum b : ClientInviteMethodEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
