/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class for the "requestStatus" in the responses from the Feed and FeedHub
 * <pre><code>
 *   {
 *     "status": {@link ApiStatusEnum},
 *     "message": "Successfully pulled patient reachability."
 *   }
 * </code></pre>
 */
public class ApiStatus {

    @JsonProperty("status")
    private ApiStatusEnum status = null;

    @JsonProperty("message")
    private String message = null;

    public ApiStatus() {

    }

    public ApiStatus(ApiStatusEnum requestStatus, String message) {
        this.status = requestStatus;
        this.message = message;
    }

    public ApiStatusEnum getStatus() {
        return status;
    }

    public void setStatus(ApiStatusEnum status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
