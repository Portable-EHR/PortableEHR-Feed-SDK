/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.convo.entry.status;

import com.portableehr.network.ApiStatus;
import com.portableehr.network.server.response.FeedApiResponse;
import com.portableehr.network.server.response.FeedApiResponseContent;

/**
 * The response to the FeedHub /feed/convo/entry [pushSingle] request
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 * }
 * </code></pre>
 */
public class EntryStatusPushSingleResponse extends FeedApiResponse {

    public EntryStatusPushSingleResponse() {
    }

    public EntryStatusPushSingleResponse(ApiStatus requestStatus, FeedApiResponseContent responseContent) {
        super(requestStatus, responseContent);
        setResponseContent(null);
    }

}
