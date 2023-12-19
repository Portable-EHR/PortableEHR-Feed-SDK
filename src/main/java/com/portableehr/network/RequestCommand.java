package com.portableehr.network;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RequestCommand {
    PULL_SINGLE("pullSingle"),
    PULL_BUNDLE("pullBundle"),
    PUSH_SINGLE("pushSingle"),
    PUSH_BUNDLE("pushBundle"),
    FUNNEL_SINGLE("funnelSingle");

    private String value;

    RequestCommand(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static RequestCommand fromValue(String text) {
        for (RequestCommand b : RequestCommand.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
