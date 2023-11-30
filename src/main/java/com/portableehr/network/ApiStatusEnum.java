/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status of the request to Feed API :<br><br>
 * <b>OK</b> : The request completed successfully.<br>
 * <b>INTERNAL</b> : The request resulted in an internal FeedHub error, the "requestStatus.message" may provide more details.<br>
 * <b>INVALID_COMMAND</b> : The command specified as part of the request to FeedHub API is not supported in that context.<br>
 * <b>INVALID_PARAMETERS</b> : One or more parameter provided with the request to FeedHub API is invalid.<br>
 * <b>INVALID_SYNTAX</b>,
 * <b>MALFORMED</b> : Wrong content or media type or failed JSON parsing.<br>
 * <b>BACKEND</b> : Forwarding of some error reported by the targeted backend.<br>
 * <b>AUTH</b> : Authentication is required as part of the request and has failed or has not been provided.<br>
 * <b>ACCESS</b> : An authenticated request is denied access to a resource, by FeedHub configuration.<br>
 * <b>NOT_FOUND</b> : The resource specified by some of the request parameters could not be found.<br>
 * <b>UNREACHABLE</b> : The final device targeted by the request (backend or patient cellphone) can't be reached.<br>
 * <b>TRANSPORT</b> : Some, likely transitory, low level protocol error or timeout prevented the request to complete.<br>
 * <b>FEEDHUB</b> : Forwarding of some error reported by the targeted FeedHub.<br>
 */
public enum ApiStatusEnum {
  OK("OK"),
  INTERNAL("INTERNAL"),
  INVALID_COMMAND("INVALID_COMMAND"),
  INVALID_PARAMETERS("INVALID_PARAMETERS"),
  INVALID_SYNTAX("INVALID_SYNTAX"),
  MALFORMED("MALFORMED"),
  BACKEND("BACKEND"),
  AUTH("AUTH"),
  ACCESS("ACCESS"),
  NOT_FOUND("NOT_FOUND"),
  UNREACHABLE("UNREACHABLE"),
  TRANSPORT("TRANSPORT"),
  FEED("FEED");

  private String value;

  ApiStatusEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ApiStatusEnum fromValue(String text) {
    for (ApiStatusEnum b : ApiStatusEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
