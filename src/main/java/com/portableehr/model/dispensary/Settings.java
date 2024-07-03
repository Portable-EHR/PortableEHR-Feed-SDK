package com.portableehr.model.dispensary;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.LanguageEnum;

/**
 * Settings
 * <pre><code>
 * {
 *     "majorityAge": 18,
 *     "minimumClientAge": 14,
 *     "communicationsLanguage": {@link LanguageEnum}
 *     "patientDefaultLanguage": {@link LanguageEnum}
 *     "privateMessageSettings": {@link PrivateMessageSettings}
 * }
 * </code></pre>
 */
public class Settings {

    @JsonProperty("majorityAge")
    private int majorityAge;

    @JsonProperty("minimumClientAge")
    private int minimumClientAge;

    @JsonProperty("communicationsLanguage")
    private LanguageEnum communicationsLanguage;

    @JsonProperty("clientDefaultLanguage")
    private LanguageEnum clientDefaultLanguage;

    @JsonProperty("privateMessageSettings")
    private PrivateMessageSettings privateMessageSettings;

    public Settings() {
    }

    public Settings(int majorityAge, int minimumClientAge, LanguageEnum communicationsLanguage, LanguageEnum clientDefaultLanguage,
                    PrivateMessageSettings privateMessageSettings) {
        this.majorityAge = majorityAge;
        this.minimumClientAge = minimumClientAge;
        this.communicationsLanguage = communicationsLanguage;
        this.clientDefaultLanguage = clientDefaultLanguage;
        this.privateMessageSettings = privateMessageSettings;
    }

    public int getMajorityAge() {
        return majorityAge;
    }

    public void setMajorityAge(int majorityAge) {
        this.majorityAge = majorityAge;
    }

    public int getMinimumClientAge() {
        return minimumClientAge;
    }

    public void setMinimumClientAge(int minimumClientAge) {
        this.minimumClientAge = minimumClientAge;
    }

    public LanguageEnum getCommunicationsLanguage() {
        return communicationsLanguage;
    }

    public void setCommunicationsLanguage(LanguageEnum communicationsLanguage) {
        this.communicationsLanguage = communicationsLanguage;
    }

    public LanguageEnum getClientDefaultLanguage() {
        return clientDefaultLanguage;
    }

    public void setClientDefaultLanguage(LanguageEnum clientDefaultLanguage) {
        this.clientDefaultLanguage = clientDefaultLanguage;
    }

    public PrivateMessageSettings getPrivateMessageSettings() {
        return privateMessageSettings;
    }

    public void setPrivateMessageSettings(PrivateMessageSettings privateMessageSettings) {
        this.privateMessageSettings = privateMessageSettings;
    }
}
