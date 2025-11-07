/*
 * Copyright © Portable EHR inc, 2025
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Any of the following Admission Status Code :<br><br>
 * <b>text</b>     : Plain text.<br>
 * <b>markdown</b> : Markdown.<br>
 * <b>html</b>     : Html.<br>
 */
public enum i18TextRendererEnum {
    TEXT("text"),
    MARKDOWN("markdown"),
    HTML("html");

  private final String value;

  i18TextRendererEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static i18TextRendererEnum fromValue(String text) {
    for (i18TextRendererEnum b : i18TextRendererEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
