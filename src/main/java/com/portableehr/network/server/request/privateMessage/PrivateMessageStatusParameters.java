/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.privateMessage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.server.PrivateMessageStatusEnum;
import com.portableehr.network.server.request.FeedHubRequestParameters;

import java.util.Date;

/**
 * Parameters sent by FeedHub in the {@link PrivateMessageStatusRequest}
 * <pre><code>
 * {
 *     "messageId": "00000000-0000-0000-0000-000000000000",
 *     "status": {@link PrivateMessageStatusEnum},
 *     "statusDate": "2021-01-14T23:41:21.050Z"
 * }
 * </code></pre>
 */
public class PrivateMessageStatusParameters extends FeedHubRequestParameters {

    @JsonProperty("messageId")
    private String messageId = null;

    @JsonProperty("status")
    private PrivateMessageStatusEnum status = null;

    @JsonProperty("statusDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date statusDate = null;

    public PrivateMessageStatusParameters() {
    }

    public PrivateMessageStatusParameters(String messageId, PrivateMessageStatusEnum status, Date statusDate) {
        this.messageId = messageId;
        this.status = status;
        this.statusDate = statusDate;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public PrivateMessageStatusEnum getStatus() {
        return status;
    }

    public void setStatus(PrivateMessageStatusEnum status) {
        this.status = status;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }
}
