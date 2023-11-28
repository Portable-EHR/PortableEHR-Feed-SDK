/*
 * Copyright © Portable EHR inc, 2023
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of recipient for an external message<br><br>
 * <b>staff</b><br>
 * <b>client</b><br>
 * <b>feed_admin</b> : The admin of the feed<br>
 * <b>support</b> : The support of PEHR<br>
 */
public enum ExternalMessageRecipientTypeEnum {
    STAFF("staff"),
    CLIENT("client"),
    FEED_ADMIN("feed_admin"),
    SUPPORT("support");

    private String value;

    ExternalMessageRecipientTypeEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ExternalMessageRecipientTypeEnum fromValue(String text) {
        for (ExternalMessageRecipientTypeEnum type : ExternalMessageRecipientTypeEnum.values()) {
            if (String.valueOf(type.value).equals(text)) {
                return type;
            }
        }
        return null;
    }
}