/*
 * Copyright © Portable EHR inc, 2023
 * https://portableehr.com/
 */

package com.portableehr.network.client.response.client.invite;

import com.portableehr.network.ApiStatus;
import com.portableehr.network.client.response.FeedHubApiResponse;

/**
 * The response to the /backend/client/reachability call
 * <pre><code>
 * {
 *   "requestStatus": {@link ApiStatus},
 *   "responseContent": {}
 * }
 * </code></pre>
 */
public class ClientInviteResponse extends FeedHubApiResponse {

}
