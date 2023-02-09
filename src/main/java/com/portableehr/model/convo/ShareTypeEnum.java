package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of element shared in a conversation : <br><br>
 * <b>private-message</b> : A PEHR private message<br>
 * <b>appointment</b> : An appointment<br>
 * <b>profile</b> : A client profile<br>
 */
public enum ShareTypeEnum {
    PRIVATE_MESSAGE("private-message"),
    APPOINTMENT("appointment"),
    PROFILE("profile");

    private final String value;

    ShareTypeEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ShareTypeEnum fromValue(String text) {
        for (ShareTypeEnum b : ShareTypeEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
