package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * <pre><code>
 * {
 *     "feedItemId": ""00000000-0000-0000-0000-000000000000",
 *     "lastUpdated": "2021-01-14T23:41:21.050Z",
 *     "identityValidatedBy": "00000000-0000-0000-0000-000000000000",
 *     "identityValidatedOn": "2021-01-14T23:41:21.050Z",
 *     "identifiedBy": [
 *       {@link ClientLegitId}1,
 *       {@link ClientLegitId}2,
 *       ...
 *       {@link ClientLegitId}N,
 *     ],
 *    "contact": {@link Contact},
 * }
 * </code></pre>
 */
public class Guardian {

    @JsonProperty("feedItemId")
    private UUID feedItemId = null;

    @JsonProperty("lastUpdated")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date lastUpdated = null;

    @JsonProperty("identityValidatedBy")
    private String identityValidatedBy = null;

    @JsonProperty("identityValidatedOn")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date identityValidatedOn = null;

    @JsonProperty("identifiedBy")
    private List<ClientLegitId> identifiedBy = new ArrayList<>();

    @JsonProperty("contact")
    private Contact contact = null;

    public Guardian() {}

    public Guardian(UUID feedItemId, Date lastUpdated, String identityValidatedBy, Date identityValidatedOn, List<ClientLegitId> identifiedBy, Contact contact) {
        this.feedItemId = feedItemId;
        this.lastUpdated = lastUpdated;
        this.identityValidatedBy = identityValidatedBy;
        this.identityValidatedOn = identityValidatedOn;
        this.identifiedBy = identifiedBy;
        this.contact = contact;
    }

    public UUID getFeedItemId() {
        return feedItemId;
    }

    public void setFeedItemId(UUID feedItemId) {
        this.feedItemId = feedItemId;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getIdentityValidatedBy() {
        return identityValidatedBy;
    }

    public void setIdentityValidatedBy(String identityValidatedBy) {
        this.identityValidatedBy = identityValidatedBy;
    }

    public Date getIdentityValidatedOn() {
        return identityValidatedOn;
    }

    public void setIdentityValidatedOn(Date identityValidatedOn) {
        this.identityValidatedOn = identityValidatedOn;
    }

    public List<ClientLegitId> getIdentifiedBy() {
        return identifiedBy;
    }

    public void setIdentifiedBy(List<ClientLegitId> identifiedBy) {
        this.identifiedBy = identifiedBy;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
