package com.portableehr.model.dispensary;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PrivateMessageSettings
 * <pre><code>
 * {
 *      "email": "some.email@domain.com",
 *      "isVerified": true
 * }
 * </code></pre>
 */
public class PrivateMessageEmailSetting {

    @JsonProperty("email")
    private String email;

    @JsonProperty("isVerified")
    private boolean isVerified;

    public PrivateMessageEmailSetting() {
    }

    public PrivateMessageEmailSetting(String email, boolean isVerified) {
        this.email = email;
        this.isVerified = isVerified;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonIgnore
    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }
}
