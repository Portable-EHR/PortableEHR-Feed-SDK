/*
 * Copyright © Portable EHR inc, 2024
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.dispensary.settings;

import com.portableehr.model.dispensary.Settings;
import com.portableehr.network.client.request.FeedBackendRequest;

/**
 * Request sent to FeedHub to get the dispensary Settings ({@link Settings}).
 * <pre><code>
 * {
 *    "feedAlias": "fiktivDP",
 *    "command": "pullSingle",
 *    "parameters": {}
 * }
 * </code></pre>
 */
public class DispensarySettingsPullSingleRequest extends FeedBackendRequest {

}
