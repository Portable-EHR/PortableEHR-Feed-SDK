/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of a trigger of a reminder.<br><br>
 * <b>enabled</b> : The trigger is active and will be trigger in the future<br>
 * <b>sent</b> : The trigger was activated in the past<br>
 * <b>inProgress</b> : The trigger is currently being activated<br>
 * <b>disabled</b> : The trigger was disabled and won't be activated<br>
 */
public enum ReminderTriggerStatusEnum {
    ENABLED("enabled"),
    SENT("sent"),
    IN_PROGRESS("inProgress"),
    DISABLED("disabled");

    private String value;

    ReminderTriggerStatusEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ReminderTriggerStatusEnum fromValue(String text) {
        for (ReminderTriggerStatusEnum status : ReminderTriggerStatusEnum.values()) {
            if (String.valueOf(status.value).equals(text)) {
                return status;
            }
        }
        return null;
    }
}