/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.network.server.response.appointment;

import com.portableehr.network.server.response.FeedApiResponse;

/**
 * Response to the /feed/appointment/dispoistion call by FeedHub
 * <pre><code>
 * {
 *   "requestStatus": {@link com.portableehr.network.ApiStatus},
 *   "responseContent": {}
 * }
 * </code></pre>
 */
public class AppointmentDispositionResponse extends FeedApiResponse {
}
