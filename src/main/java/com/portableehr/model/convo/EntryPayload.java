package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes( {
        @JsonSubTypes.Type(EntryPayloadMessage.class),
        @JsonSubTypes.Type(EntryPayloadMove.class),
        @JsonSubTypes.Type(EntryPayloadParticipant.class),
        @JsonSubTypes.Type(EntryPayloadStatusChange.class),
})
public abstract class EntryPayload {
}
