/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sets the CORS rules. You can include up to five CorsRule elements in the
 * request.
 */
public class CorsRules {
    /**
     * The List of CORS rules. You can include up to five CorsRule elements in
     * the request.
     */
    @JsonProperty(value = "corsRules")
    private List<CorsRule> corsRules;

    /**
     * Get the List of CORS rules. You can include up to five CorsRule elements in the request.
     *
     * @return the corsRules value
     */
    public List<CorsRule> corsRules() {
        return this.corsRules;
    }

    /**
     * Set the List of CORS rules. You can include up to five CorsRule elements in the request.
     *
     * @param corsRules the corsRules value to set
     * @return the CorsRules object itself.
     */
    public CorsRules withCorsRules(List<CorsRule> corsRules) {
        this.corsRules = corsRules;
        return this;
    }

}
