/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of the reminder.<br><br>
 * <b>pending</b> : The reminder is pending and ready to be trigger<br>
 * <b>complete</b> : The reminder was complete and wont be trigger<br>
 */
public enum ReminderStatusEnum {
    PENDING("pending"),
    COMPLETE("complete");

    private String value;

    ReminderStatusEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ReminderStatusEnum fromValue(String text) {
        for (ReminderStatusEnum status : ReminderStatusEnum.values()) {
            if (String.valueOf(status.value).equals(text)) {
                return status;
            }
        }
        return null;
    }
}