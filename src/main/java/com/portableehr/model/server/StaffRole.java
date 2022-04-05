package com.portableehr.model.server;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StaffRole {
    ADMIN("admin"),
    STAFF("staff"),
    PRIVILEGED_STAFF("privileged_staff"),
    GUEST("guest");

    private String value;

    StaffRole(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static StaffRole fromValue(String text) {
        for (StaffRole b : StaffRole.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
