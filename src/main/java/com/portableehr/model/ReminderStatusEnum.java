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
 * <b>inProgress</b> : The reminder was trigger, has not been completed, and there are triggers in the future<br>
 * <b>disabled</b> : The reminder was disabled by the Feed and won't be trigger<br>
 * <b>complete</b> : All triggers of the reminder where triggered<br>
 */
public enum ReminderStatusEnum {
    PENDING("pending"),
    IN_PROGRESS("inProgress"),
    DISABLED("disabled"),
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