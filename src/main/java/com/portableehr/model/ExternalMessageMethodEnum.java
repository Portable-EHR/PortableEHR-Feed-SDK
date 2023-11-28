/*
 * Copyright © Portable EHR inc, 2023
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The method to be used to send an external message<br><br>
 * <b>email</b><br>
 * <b>sms</b><br>
 * <b>push</b> : The message will be sent as a "push notification"/"cloud message"<br>
 */
public enum ExternalMessageMethodEnum {
    EMAIL("email"),
    SMS("sms"),
    PUSH("push");

    private String value;

    ExternalMessageMethodEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ExternalMessageMethodEnum fromValue(String text) {
        for (ExternalMessageMethodEnum methodEnum : ExternalMessageMethodEnum.values()) {
            if (String.valueOf(methodEnum.value).equals(text)) {
                return methodEnum;
            }
        }
        return null;
    }
}