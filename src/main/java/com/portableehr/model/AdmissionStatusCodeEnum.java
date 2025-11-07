/*
 * Copyright © Portable EHR inc, 2025
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Any of the following Admission Status Code :<br><br>
 * <b>ADMISSION_COMPLETE</b> : Admission complete without problems.<br>
 * <b>ADMISSION_PENDING</b>  : Admission bein processed.<br>
 * <br>
 * <b>CONFLICT_EMAIL</b>  : The provided email mismatches the one on file for an otherwise matching client.<br>
 * <b>CONFLICT_MOBILE</b> : The provided mobile mismatches the one on file for an otherwise matching client.<br>
 * <b>CONFLICT_CREDS</b>  : The provided email and mobile mismatches the ones on file for an otherwise matching client.<br>
 * <b>CONFLICT_NAME</b>   : The provided name mismatches the one on file for an otherwise matching client.<br>
 * <b>CONFLICT_DOB</b>    : The provided date of birth mismatches the one on file for an otherwise matching client.<br>
 * <b>CONFLICT_GENDER</b> : The provided gender mismatches the one on file for an otherwise matching client.<br>
 * <b>CONFLICT_OTHER</b>  : The provided information mismatches the one on file for another client.<br>
 * <br>
 * <b>ERROR_INVALID_EMAIL</b>                 : The provided email is invalid.<br>
 * <b>ERROR_INVALID_MOBILE</b>                : The provided mobile is invalid.<br>
 * <b>ERROR_INVALID_PATIENT_CREDS</b>         : The provided email and mobile are invalid.<br>
 * <b>ERROR_INVALID_GUARDIAN</b>              : A guardian cannot have a guardian.<br>
 * <b>ERROR_GUARDIAN_ADMISSION_INCOMPLETE</b> : The specified guardian has not completed admission yet.<br>
 * <b>ERROR_PENDING</b>                       : A previous admission is still being processed.<br>
 * <b>ERROR_UNKNOWN</b>                       : An unknown error happened.<br>
 */
public enum AdmissionStatusCodeEnum {
    ADMISSION_COMPLETE("ADMISSION_COMPLETE"),
    ADMISSION_PENDING("ADMISSION_PENDING"),

    CONFLICT_EMAIL("CONFLICT_EMAIL"),
    CONFLICT_MOBILE("CONFLICT_MOBILE"),
    CONFLICT_CREDS("CONFLICT_CREDS"),
    CONFLICT_NAME("CONFLICT_NAME"),
    CONFLICT_DOB("CONFLICT_DOB"),
    CONFLICT_GENDER("CONFLICT_GENDER"),
    CONFLICT_OTHER("CONFLICT_OTHER"),

    ERROR_INVALID_EMAIL("ERROR_INVALID_EMAIL"),
    ERROR_INVALID_MOBILE("ERROR_INVALID_MOBILE"),
    ERROR_INVALID_PATIENT_CREDS("ERROR_INVALID_PATIENT_CREDS"),
    ERROR_INVALID_GUARDIAN("ERROR_INVALID_GUARDIAN"),
    ERROR_GUARDIAN_ADMISSION_INCOMPLETE("ERROR_GUARDIAN_ADMISSION_INCOMPLETE"),
    ERROR_PENDING("ERROR_PENDING"),
    ERROR_UNKNOWN("ERROR_UNKNOWN");

  private final String value;

  AdmissionStatusCodeEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AdmissionStatusCodeEnum fromValue(String text) {
    for (AdmissionStatusCodeEnum b : AdmissionStatusCodeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
