/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.idIssuers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.client.JurisdictionIdIssuer;
import com.portableehr.network.client.response.FeedHubApiResponseContent;

import java.util.List;

/**
 * The responseContent field for the {@link IdIssuersResponse}
 * <pre><code>
 * [
 *      {@link JurisdictionIdIssuer}1,
 *      {@link JurisdictionIdIssuer}2,
 *      ...
 *      {@link JurisdictionIdIssuer}N
 * ]
 * </code></pre>
 */
public class IdIssuersResponseContent extends FeedHubApiResponseContent {

    @JsonProperty("results")
    private List<JurisdictionIdIssuer> result;

    public IdIssuersResponseContent() {
    }

    public IdIssuersResponseContent(List<JurisdictionIdIssuer> result) {
        this.result = result;
    }

    public List<JurisdictionIdIssuer> getResult() {
        return result;
    }

    public void setResult(List<JurisdictionIdIssuer> result) {
        this.result = result;
    }
}
