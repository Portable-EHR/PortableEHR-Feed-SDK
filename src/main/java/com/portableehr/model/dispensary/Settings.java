package com.portableehr.model.dispensary;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.LanguageEnum;

/**
 * Settings
 * <pre><code>
 * {
 *     "majorityAge": 18,
 *     "minimumPatientAge": 14,
 *     "communicationsLanguage": {@link LanguageEnum}
 *     "patientDefaultLanguage": {@link LanguageEnum}
 *     "privateMessageSettings": {@link PrivateMessageSettings}
 * }
 * </code></pre>
 */
public class Settings {

    @JsonProperty("majorityAge")
    private int majorityAge;

    @JsonProperty("minimumPatientAge")
    private int minimumPatientAge;

    @JsonProperty("communicationsLanguage")
    private LanguageEnum communicationsLanguage;

    @JsonProperty("patientDefaultLanguage")
    private LanguageEnum patientDefaultLanguage;

    @JsonProperty("privateMessageSettings")
    private PrivateMessageSettings privateMessageSettings;

    public Settings() {
    }

    public Settings(int majorityAge, int minimumPatientAge, LanguageEnum communicationsLanguage, LanguageEnum patientDefaultLanguage,
                    PrivateMessageSettings privateMessageSettings) {
        this.majorityAge = majorityAge;
        this.minimumPatientAge = minimumPatientAge;
        this.communicationsLanguage = communicationsLanguage;
        this.patientDefaultLanguage = patientDefaultLanguage;
        this.privateMessageSettings = privateMessageSettings;
    }

    public int getMajorityAge() {
        return majorityAge;
    }

    public void setMajorityAge(int majorityAge) {
        this.majorityAge = majorityAge;
    }

    public int getMinimumPatientAge() {
        return minimumPatientAge;
    }

    public void setMinimumPatientAge(int minimumPatientAge) {
        this.minimumPatientAge = minimumPatientAge;
    }

    public LanguageEnum getCommunicationsLanguage() {
        return communicationsLanguage;
    }

    public void setCommunicationsLanguage(LanguageEnum communicationsLanguage) {
        this.communicationsLanguage = communicationsLanguage;
    }

    public LanguageEnum getPatientDefaultLanguage() {
        return patientDefaultLanguage;
    }

    public void setPatientDefaultLanguage(LanguageEnum patientDefaultLanguage) {
        this.patientDefaultLanguage = patientDefaultLanguage;
    }

    public PrivateMessageSettings getPrivateMessageSettings() {
        return privateMessageSettings;
    }

    public void setPrivateMessageSettings(PrivateMessageSettings privateMessageSettings) {
        this.privateMessageSettings = privateMessageSettings;
    }
}
