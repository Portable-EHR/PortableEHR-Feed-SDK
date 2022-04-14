/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.convo.entry.attachment;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.portableehr.model.convo.Attachment;
import com.portableehr.network.server.response.FeedApiResponseContent;

/**
 * The responseContent attribute for the {@link AttachmentPullSingleResponse}
 * <pre><code>
 * Serializes as a {@link Attachment}
 * </code></pre>
 */
public class AttachmentPullSingleResponseContent extends FeedApiResponseContent {

    @JsonUnwrapped
    Attachment attachment;

    public AttachmentPullSingleResponseContent() {
    }

    public AttachmentPullSingleResponseContent(Attachment attachment) {
        this.attachment = attachment;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
}
