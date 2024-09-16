/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.convo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The status of the questionnaire for the participant : <br><br>
 * <b>incomplete</b> : The participant has NOT completed the questionnaire<br>
 * <b>complete</b> : The participant has completed the questionnaire<br>
 */
public enum QuestionnaireParticipantStatusEnum {
  INCOMPLETE("incomplete"),
  COMPLETE("complete");

  private final String value;

  QuestionnaireParticipantStatusEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static QuestionnaireParticipantStatusEnum fromValue(String text) {
    for (QuestionnaireParticipantStatusEnum state : QuestionnaireParticipantStatusEnum.values()) {
      if (String.valueOf(state.value).equals(text)) {
        return state;
      }
    }
    return null;
  }
}
