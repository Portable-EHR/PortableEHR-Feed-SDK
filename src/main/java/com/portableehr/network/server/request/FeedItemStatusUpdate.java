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
 *     "feedItemId": "00000000-0000-0000-0000-000000000000",
 *     "status": {@link ApiStatusEnum},
 *     "message": "Optional. Only useful in the case of status != {@link ApiStatusEnum#OK}",
 *     "errorCode": "Optional. Only useful in the case of status != {@link ApiStatusEnum#OK}"
 *     "responseContent": {@link FeedItemStatusUpdateResponseContent},
 *   }
 * </code></pre>
 */
public class FeedItemStatusUpdate {

    @JsonProperty("feedItemId")
    private String feedItemId = null;

    @JsonProperty("status")
    private ApiStatusEnum status = null;

    @JsonProperty("message")
    private String message = null;

    @JsonProperty("errorCode")
    private String errorCode = null;

    @JsonProperty("responseContent")
    private FeedItemStatusUpdateResponseContent responseContent = null;

    public FeedItemStatusUpdate() {

    }

    public FeedItemStatusUpdate(String feedItemId, ApiStatusEnum status, String message, String errorCode, FeedItemStatusUpdateResponseContent responseContent) {
        this.feedItemId = feedItemId;
        this.status = status;
        this.message = message;
        this.errorCode = errorCode;
        this.responseContent = responseContent;
    }

    public String getFeedItemId() {
        return feedItemId;
    }

    public void setFeedItemId(String feedItemId) {
        this.feedItemId = feedItemId;
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

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public FeedItemStatusUpdateResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(FeedItemStatusUpdateResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
