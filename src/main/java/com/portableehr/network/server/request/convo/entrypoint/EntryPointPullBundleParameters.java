/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo.entrypoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.LanguageEnum;
import com.portableehr.network.server.request.convo.ConvoPullSingleRequest;

import java.util.UUID;

/**
 * The parameters for the {@link ConvoPullSingleRequest}
 * <pre><code>
 * {
 *     "clientId": "the id of the client pulling the entry points",
 *     "lang": {@link LanguageEnum}
 * }
 * </code></pre>
 */
public class EntryPointPullBundleParameters {

    @JsonProperty("clientId")
    private UUID clientId = null;

    @JsonProperty("lang")
    private LanguageEnum lang = null;

    public EntryPointPullBundleParameters() {
    }

    public EntryPointPullBundleParameters(UUID clientId, LanguageEnum lang) {
        this.clientId = clientId;
        this.lang = lang;
    }

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public LanguageEnum getLang() {
        return lang;
    }

    public void setLang(LanguageEnum lang) {
        this.lang = lang;
    }
}
