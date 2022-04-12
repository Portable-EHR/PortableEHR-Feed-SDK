/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Who can read the entry : <br><br>
 * <b>client</b> : Just the client(s)<br>
 * <b>staff</b> : Just the members of the staff<br>
 * <b>privileged_staff</b> : Just the members of the staff with access to private information<br>
 * <b>all</b> : Everyone in the conversation<br>
 */
public enum EntryAudienceEnum {
  CLIENT("client"),
  STAFF("staff"),
  PRIVILEGED_STAFF("privileged_staff"),
  ALL("all");

  private String value;

  EntryAudienceEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EntryAudienceEnum fromValue(String text) {
    for (EntryAudienceEnum b : EntryAudienceEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
