/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The kind of jurisdiction-dependent issuer under which this practice authorization is issued.<br><br>
 * <b>practiceLicense</b> : State sanctioned organization issuing practice privilege for profession typically with health, legal or financial impact on the population<br>
 */
public enum LicenseIssuerKindEnum {
    PRACTICE_LICENSE("practiceLicense");

    private String value;

    LicenseIssuerKindEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static LicenseIssuerKindEnum fromValue(String text) {
        for (LicenseIssuerKindEnum b : LicenseIssuerKindEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}