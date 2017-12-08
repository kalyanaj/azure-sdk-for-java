/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.faceapi;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties describing any presence of blur within the image.
 */
public class BlurProperties {
    /**
     * An enum value indicating level of blurriness. Possible values include:
     * 'Low', 'Medium', 'High'.
     */
    @JsonProperty(value = "blurLevel")
    private BlurLevels blurLevel;

    /**
     * A number indicating level of blurriness ranging from 0 to 1.
     */
    @JsonProperty(value = "value")
    private Double value;

    /**
     * Get the blurLevel value.
     *
     * @return the blurLevel value
     */
    public BlurLevels blurLevel() {
        return this.blurLevel;
    }

    /**
     * Set the blurLevel value.
     *
     * @param blurLevel the blurLevel value to set
     * @return the BlurProperties object itself.
     */
    public BlurProperties withBlurLevel(BlurLevels blurLevel) {
        this.blurLevel = blurLevel;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Double value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the BlurProperties object itself.
     */
    public BlurProperties withValue(Double value) {
        this.value = value;
        return this;
    }

}