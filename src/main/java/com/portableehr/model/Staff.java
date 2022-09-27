/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Staff
 * <pre><code>
 * {
 *     "feedAlias": "fiktivDP",
 *     "feedItemId": "00000000-0000-0000-0000-000000000000",
 *     "backendItemId": "00000000-0000-0000-0000-000000000000",
 *     "lastUpdated": "2021-01-14T23:41:21.050Z",
 *     "feedItemVersion": 1,
 *     "roles": ["staff", "reception", "someVerySpecificRoleOfYourOrganization"],
 *     "contact": {@link Contact}
 *   }
 * </code></pre>
 */
public class Staff {

    @JsonProperty("feedAlias")
    private String feedAlias = null;

    @JsonProperty("feedItemId")
    private UUID feedItemId = null;

    @JsonProperty("backendItemId")
    private UUID backendItemId = null;

    @JsonProperty("lastUpdated")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date lastUpdated = null;

    @JsonProperty("feedItemVersion")
    private Integer feedItemVersion = null;

    @JsonProperty("roles")
    private List<String> roles = null;

    @JsonProperty("contact")
    private Contact contact = null;

    public Staff() {
    }

    public Staff(String feedAlias, UUID feedItemId, UUID backendItemId, Date lastUpdated, Integer feedItemVersion, List<String> roles, Contact contact) {
        this.feedAlias = feedAlias;
        this.feedItemId = feedItemId;
        this.backendItemId = backendItemId;
        this.lastUpdated = lastUpdated;
        this.feedItemVersion = feedItemVersion;
        this.roles = roles;
        this.contact = contact;
    }

    public String getFeedAlias() {
        return feedAlias;
    }

    public void setFeedAlias(String feedAlias) {
        this.feedAlias = feedAlias;
    }

    public UUID getFeedItemId() {
        return feedItemId;
    }

    public void setFeedItemId(UUID feedItemId) {
        this.feedItemId = feedItemId;
    }

    public UUID getBackendItemId() {
        return backendItemId;
    }

    public void setBackendItemId(UUID backendItemId) {
        this.backendItemId = backendItemId;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Integer getFeedItemVersion() {
        return feedItemVersion;
    }

    public void setFeedItemVersion(Integer feedItemVersion) {
        this.feedItemVersion = feedItemVersion;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
