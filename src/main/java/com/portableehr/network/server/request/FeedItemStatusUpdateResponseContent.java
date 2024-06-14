/*
 * Copyright © Portable EHR inc, 2024
 * https://portableehr.com/
 */

package com.portableehr.network.server.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.network.ApiStatusEnum;
import com.portableehr.network.server.request.client.ClientAdmissionStatusUpdate;

import java.util.List;

/**
 * Class for the "ResponseContent" in the FeedItemStatusUpdate from FeedHub
 * <br/><br/>
 * In case of <code>update.status != {@link ApiStatusEnum#OK}<code/> look for the "errors" attribute<br/><br/>
 * Otherwise a child of this class would be used. Children :<br/>
 * - {@link ClientAdmissionStatusUpdate}
 */
public class FeedItemStatusUpdateResponseContent {

    @JsonProperty("errors")
    protected List<FeedItemError> errors = null;

    public FeedItemStatusUpdateResponseContent() {
    }

    public FeedItemStatusUpdateResponseContent(List<FeedItemError> errors) {
        this.errors = errors;
    }

    public List<FeedItemError> getErrors() {
        return errors;
    }

    public void setErrors(List<FeedItemError> errors) {
        this.errors = errors;
    }
}
