/*
 * Copyright © Portable EHR inc, 2025
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
 * ClientStatus
 * <pre><code>
 * {
 *     "backendClientId": "4354c4cc-0656-6a6f-8eeb-ba00a47f7615",
 *     "feedItemId": "70e973dc-1c46-4a02-97c7-6b2f21d4703a",
 *     "reachable": false,
 *     "identityVerified": false,
 *     "emailVerified": false,
 *     "mobileVerified": false,
 *     "lastSeen": "2025-11-07T12:36:26+0000",
 *     "admission": {@link ClientAdmissionStatus},
 *     "createdOn": "2025-11-07T12:36:26+0000",
 *     "lastUpdated": "2025-11-07T12:36:26+0000"
 * }
 * </code></pre>
 */
public class ClientStatus {

    @JsonProperty("backendClientId")
    private UUID backendClientId = null;

    @JsonProperty("feedItemId")
    private UUID feedItemId = null;

    @JsonProperty("reachable")
    private boolean reachable = false;

    @JsonProperty("identityVerified")
    private boolean identityVerified = false;

    @JsonProperty("emailVerified")
    private boolean emailVerified = false;

    @JsonProperty("mobileVerified")
    private boolean mobileVerified = false;

    @JsonProperty("lastSeen")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date lastSeen = null;

    @JsonProperty("admission")
    private ClientAdmissionStatus admission = null;

    @JsonProperty("createdOn")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date createdOn = null;

    @JsonProperty("lastUpdated")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date lastUpdated = null;


    public ClientStatus() {
    }

    public UUID getBackendClientId() {
        return backendClientId;
    }

    public void setBackendClientId(UUID backendClientId) {
        this.backendClientId = backendClientId;
    }

    public UUID getFeedItemId() {
        return feedItemId;
    }

    public void setFeedItemId(UUID feedItemId) {
        this.feedItemId = feedItemId;
    }

    public boolean isReachable() {
        return reachable;
    }

    public void setReachable(boolean reachable) {
        this.reachable = reachable;
    }

    public boolean isIdentityVerified() {
        return identityVerified;
    }

    public void setIdentityVerified(boolean identityVerified) {
        this.identityVerified = identityVerified;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public boolean isMobileVerified() {
        return mobileVerified;
    }

    public void setMobileVerified(boolean mobileVerified) {
        this.mobileVerified = mobileVerified;
    }

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    public ClientAdmissionStatus getAdmission() {
        return admission;
    }

    public void setAdmission(ClientAdmissionStatus admission) {
        this.admission = admission;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
