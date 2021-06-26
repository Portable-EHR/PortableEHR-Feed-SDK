/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The kind of jurisdiction-dependent issuer under which this legit identity is issued.<br><br>
 * <b>healthCare</b> : State or private organization providing health insurance coverage.<br>
 * <b>socialSecurity</b> : State organization providing social security coverage<br>
 * <b>passport</b> : State organization providing traveling document certifying the identity and nationality of the holder<br>
 * <b>practiceLicense</b> : State sanctioned organization issuing practice privilege for profession typically with health, legal or financial impact on the population<br>
 * <b>other</b> : For Portable EHR custom ids when none other is provided.<br>
 */
public enum IdIssuerKindEnum {
    HEALTHCARE("healthCare"),
    SOCIAL_SECURITY("socialSecurity"),
    PASSPORT("passport"),
    DRIVER_LICENSE("driverLicense"),
    PRACTICE_LICENSE("practiceLicense"),
    STATE_ID("stateID"),
    OTHER("other");

    private String value;

    IdIssuerKindEnum(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static IdIssuerKindEnum fromValue(String text) {
        for (IdIssuerKindEnum b : IdIssuerKindEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}