package com.portableehr.model.dispensary;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * PrivateMessageSettings
 * <pre><code>
 * {
 *      "reminderDelay": "PT10M",
 *      "fallbackDelay": "PT48H",
 *      "failOnFallback": true,
 *      "emailOnFallback": [
 *          {@link PrivateMessageEmailSetting}
 *      ]
 * }
 * </code></pre>
 */
public class PrivateMessageSettings {

    @JsonProperty("reminderDelay")
    private String reminderDelay;

    @JsonProperty("fallbackDelay")
    private String fallbackDelay;

    @JsonProperty("failOnFallback")
    private boolean failOnFallback;

    @JsonProperty("emailOnFallback")
    private List<PrivateMessageEmailSetting> emailOnFallback;

    public PrivateMessageSettings() {
    }

    public PrivateMessageSettings(String reminderDelay, String fallbackDelay, boolean failOnFallback, List<PrivateMessageEmailSetting> emailOnFallback) {
        this.reminderDelay = reminderDelay;
        this.fallbackDelay = fallbackDelay;
        this.failOnFallback = failOnFallback;
        this.emailOnFallback = emailOnFallback;
    }

    public String getReminderDelay() {
        return reminderDelay;
    }

    public void setReminderDelay(String reminderDelay) {
        this.reminderDelay = reminderDelay;
    }

    public String getFallbackDelay() {
        return fallbackDelay;
    }

    public void setFallbackDelay(String fallbackDelay) {
        this.fallbackDelay = fallbackDelay;
    }

    public boolean isFailOnFallback() {
        return failOnFallback;
    }

    public void setFailOnFallback(boolean failOnFallback) {
        this.failOnFallback = failOnFallback;
    }

    public List<PrivateMessageEmailSetting> getEmailOnFallback() {
        return emailOnFallback;
    }

    public void setEmailOnFallback(List<PrivateMessageEmailSetting> emailOnFallback) {
        this.emailOnFallback = emailOnFallback;
    }
}
