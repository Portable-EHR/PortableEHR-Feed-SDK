package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The role of a conversation participant : <br><br>
 * <b>admin</b> : This is the participant (staff) assigned to the conversation<br>
 * <b>participant</b> : Every other participant<br>
 */
public enum ParticipantRoleEnum {
    ADMIN("admin"),
    PARTICIPANT("participant");

    private String value;

    ParticipantRoleEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ParticipantRoleEnum fromValue(String text) {
        for (ParticipantRoleEnum b : ParticipantRoleEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
