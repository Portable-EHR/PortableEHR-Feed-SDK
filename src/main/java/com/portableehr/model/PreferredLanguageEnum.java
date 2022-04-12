/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A ISO 639-1 two-letter language code, in all lower case, of the preferred language of the contact.
 * For the moment, Portable EHR supports <i>en</i> and <i>fr</i>, as languages of communication.<br><br>
 * <b>en</b><br>
 * <b>fr</b><br>
 */
public enum PreferredLanguageEnum {
    EN("en"),
    FR("fr");

    private String value;

    PreferredLanguageEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static PreferredLanguageEnum fromValue(String text) {
        for (PreferredLanguageEnum b : PreferredLanguageEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}