/*
 * Copyright © Portable EHR inc, 2024
 * https://portableehr.com/
 */

package com.portableehr.network.client.request.dispensary.settings;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.portableehr.model.dispensary.Settings;
import com.portableehr.network.RequestCommand;
import com.portableehr.network.client.request.FeedBackendRequest;

/**
 * Request sent to FeedHub to save a dispensary Settings ({@link Settings}).
 * <pre><code>
 * {
 *    "feedAlias": "fiktivDP",
 *    "command": "pushSingle",
 *    "parameters": [{@link Settings}]
 * }
 * </code></pre>
 */
public class DispensarySettingsPushSingleRequest extends FeedBackendRequest {

    @JsonProperty("parameters")
    private Settings parameters = null;

    public DispensarySettingsPushSingleRequest() {
    }

    public DispensarySettingsPushSingleRequest(Settings parameters) {
        this.parameters = parameters;
    }

    public DispensarySettingsPushSingleRequest(String feedAlias, RequestCommand command, Settings parameters) {
        super(feedAlias, command);
        this.parameters = parameters;
    }

    @Override
    public Settings getParameters() {
        return this.parameters;
    }

    public void setParameters(Settings parameters) {
        this.parameters = parameters;
    }
}
