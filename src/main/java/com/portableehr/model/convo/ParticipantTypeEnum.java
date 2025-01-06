package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The type of conversation's participant : <br><br>
 * <b>client</b> : This participant is one of the client being served<br>
 * <b>staff</b> : This participant is part of the organization serving the client(s)<br>
 * <b>client_guest</b> : This participant was invited by the client. Example : A spouse<br>
 * <b>staff_guest</b> : This participant was invited by the organization. Example : An expert<br>
 * <b>system</b> : The system performing automatism like sending welcome messages, reminders, etc.<br>
 */
public enum ParticipantTypeEnum {
    CLIENT("client"),
    CLIENT_GUEST("client_guest"),
    STAFF("staff"),
    PRIVILEGED_STAFF("privileged_staff"),
    STAFF_GUEST("staff_guest"),
    SYSTEM("system");

    private String value;

    ParticipantTypeEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ParticipantTypeEnum fromValue(String text) {
        for (ParticipantTypeEnum b : ParticipantTypeEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
