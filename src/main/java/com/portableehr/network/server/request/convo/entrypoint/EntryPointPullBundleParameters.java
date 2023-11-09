/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.convo.entrypoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.LanguageEnum;
import com.portableehr.network.server.request.convo.ConvoPullSingleRequest;

/**
 * The parameters for the {@link ConvoPullSingleRequest}
 * <pre><code>
 * {
 *     "lang": {@link LanguageEnum}
 * }
 * </code></pre>
 */
public class EntryPointPullBundleParameters {

    @JsonProperty("lang")
    private LanguageEnum lang = null;

    public EntryPointPullBundleParameters() {
    }

    public EntryPointPullBundleParameters(LanguageEnum lang) {
        this.lang = lang;
    }

    public LanguageEnum getLang() {
        return lang;
    }

    public void setLang(LanguageEnum lang) {
        this.lang = lang;
    }
}
