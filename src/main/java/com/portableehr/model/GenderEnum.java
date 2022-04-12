/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Any of the following gender :<br><br>
 * <b>F</b> : Female.<br>
 * <b>M</b> : Male.<br>
 * <b>N</b> : Non binary.<br>
 */
public enum GenderEnum {
  F("F"),
  M("M"),
  N("N");

  private String value;

  GenderEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static GenderEnum fromValue(String text) {
    for (GenderEnum b : GenderEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
