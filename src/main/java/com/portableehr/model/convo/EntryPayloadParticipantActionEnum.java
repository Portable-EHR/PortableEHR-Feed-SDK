package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The action performed by an entry of type EntryPayloadParticipant (type participant or assign): <br><br>
 * <b>add</b> : The entry adds a Participant (type participant)<br>
 * <b>remove</b> : The entry removes a Participant (type participant)<br>
 * <b>assign</b> : The entry assigns a Participant as Admin (type assign)<br>
 */
public enum EntryPayloadParticipantActionEnum {
    ADD("add"),
    REMOVE("remove"),
    ASSIGN("assign");

    private String value;

    EntryPayloadParticipantActionEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static EntryPayloadParticipantActionEnum fromValue(String text) {
        for (EntryPayloadParticipantActionEnum b : EntryPayloadParticipantActionEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}