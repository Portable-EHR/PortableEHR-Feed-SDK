/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo.entrypoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.PreferredLanguageEnum;
import com.portableehr.model.convo.Conversation;
import com.portableehr.model.convo.ConversationEnvelop;
import com.portableehr.model.convo.ParticipantTypeEnum;
import com.portableehr.network.server.request.FeedHubRequestParameters;
import com.portableehr.network.server.request.convo.ConvoPullSingleRequest;

import java.util.UUID;

/**
 * The parameters for the {@link ConvoPullSingleRequest}
 * <pre><code>
 * {
 *     "lang": {@link PreferredLanguageEnum}
 * }
 * </code></pre>
 */
public class EntryPointPullBundleParameters extends FeedHubRequestParameters {

    @JsonProperty("lang")
    private PreferredLanguageEnum lang = null;

    public EntryPointPullBundleParameters() {
    }

    public EntryPointPullBundleParameters(PreferredLanguageEnum lang) {
        this.lang = lang;
    }

    public PreferredLanguageEnum getLang() {
        return lang;
    }

    public void setLang(PreferredLanguageEnum lang) {
        this.lang = lang;
    }
}
