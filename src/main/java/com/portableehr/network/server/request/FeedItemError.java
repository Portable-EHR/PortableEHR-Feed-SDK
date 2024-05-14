/*
 * Copyright © Portable EHR inc, 2024
 * https://portableehr.com/
 */

package com.portableehr.network.server.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents one individual error/problem of a Feed Item
 * <pre><code>
 *   {
 *     "code": "Optional. Very likely unused in the scope of this card. Indicates what is the problem with the field: It’s missing, invalid format, invalid value, etc.",
 *     "field": "Mandatory. The complete field name of the feed item. In case of client an example will be 'demographics.dateOfBirth'.",
 *     "message": "Optional. Error message for log porpoises. Not intended for the final user.",
 *   }
 * </code></pre>
 */
public class FeedItemError {

    @JsonProperty("code")
    private String code = null;

    @JsonProperty("field")
    private String field = null;

    @JsonProperty("message")
    private String message = null;


    public FeedItemError() {

    }

    public FeedItemError(String code, String field, String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
