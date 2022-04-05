/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.ApiStatus;
import com.portableehr.network.server.response.client.ClientPullResponse;
import com.portableehr.network.server.response.staff.StaffPullResponse;

/**
 * Class containing the minimum attributes in the responses to FeedHub.
 * Most responses are subclasses of this one, but not all.
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {@link FeedApiResponseContent}
 * }
 * </code></pre>
 * Subclasses:<br>
 * {@link com.portableehr.network.server.response.appointment.AppointmentDispositionResponse}
 * {@link com.portableehr.network.server.response.appointment.AppointmentPullResponse}
 * {@link com.portableehr.network.server.response.login.LoginResponse}
 * {@link ClientPullResponse}
 * {@link StaffPullResponse}
 * {@link com.portableehr.network.server.response.privateMessage.PrivateMessageContentResponse}
 * {@link com.portableehr.network.server.response.privateMessage.PrivateMessageStatusResponse}
 */
public class FeedApiResponse {
    @JsonProperty("requestStatus")
    private ApiStatus requestStatus = null;

    @JsonProperty("responseContent")
    private FeedApiResponseContent responseContent = null;

    public FeedApiResponse() {
    }

    public FeedApiResponse(ApiStatus requestStatus, FeedApiResponseContent responseContent) {
        this.requestStatus = requestStatus;
        this.responseContent = responseContent;
    }

    /**
     * Get requestStatus
     *
     * @return requestStatus
     **/
    public ApiStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(ApiStatus requestStatus) {
        this.requestStatus = requestStatus;
    }

    /**
     * Get responseContent
     *
     * @return responseContent
     **/
    public FeedApiResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(FeedApiResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
