/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.request.client;

import com.portableehr.network.ApiStatusEnum;
import com.portableehr.network.client.response.client.ClientPushSingleResponseContent;
import com.portableehr.network.server.request.FeedItemStatusUpdate;

/**
 * Parameters for the request sent by FeedHub to update the feed on the status of a client admission. <br/>
 * See {@link FeedItemStatusUpdate}<br/>
 * <pre><code>
 *   {
 *     "feedItemId": "00000000-0000-0000-0000-000000000000",
 *     "status": {@link ApiStatusEnum},
 *     "message": "Optional. Only useful in the case of status != {@link ApiStatusEnum#OK}",
 *     "errorCode": "Optional. Only useful in the case of status != {@link ApiStatusEnum#OK}"
 *     "responseContent": {@link ClientPushSingleResponseContent},
 *   }
 * </code></pre>
 */
public class ClientAdmissionStatusUpdate extends FeedItemStatusUpdate {

    public ClientAdmissionStatusUpdate() {
    }

    public ClientAdmissionStatusUpdate(String feedItemId, ApiStatusEnum status, String message, String errorCode, ClientPushSingleResponseContent responseContent) {
        super(feedItemId, status, message, errorCode, responseContent);
    }

    public ClientPushSingleResponseContent getResponseContent() {
        return (ClientPushSingleResponseContent) responseContent;
    }

    public void setResponseContent(ClientPushSingleResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
