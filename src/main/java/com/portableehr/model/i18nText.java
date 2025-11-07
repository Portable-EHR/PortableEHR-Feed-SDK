/*
 * Copyright © Portable EHR inc, 2025
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClientAdmissionStatus
 * <pre><code>
 * {
 *     "renderer": "text",
 *     "en": "Text in english",
 *     "fr": "Text en français",
 *     "es": "Texto en español"
 * }
 * </code></pre>
 */
public class i18nText {

    @JsonProperty("renderer")
    private i18TextRendererEnum renderer = null;

    @JsonProperty("en")
    private String en  = null;

    @JsonProperty("fr")
    private String fr  = null;

    @JsonProperty("es")
    private String es  = null;

    public i18nText() {
    }

    public i18TextRendererEnum getRenderer() {
        return renderer;
    }

    public void setRenderer(i18TextRendererEnum renderer) {
        this.renderer = renderer;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }
}
