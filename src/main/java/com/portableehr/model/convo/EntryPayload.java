package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, defaultImpl = EntryPayloadMessage.class)
@JsonSubTypes( {
        @JsonSubTypes.Type(EntryPayloadMessage.class),
        @JsonSubTypes.Type(EntryPayloadMove.class),
        @JsonSubTypes.Type(EntryPayloadParticipant.class),
        @JsonSubTypes.Type(EntryPayloadStatusChange.class),
        @JsonSubTypes.Type(EntryPayloadShare.class),
})
public abstract class EntryPayload {
}
