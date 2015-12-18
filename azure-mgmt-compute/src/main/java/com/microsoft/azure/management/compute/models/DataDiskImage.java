/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.compute.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the data disk images information.
 */
public class DataDiskImage {
    /**
     * Gets the LUN number for a data disk.This value is used to identify data
     * disk image inside the VMImage therefore it must be unique for each
     * data disk.The allowed character for the value is digit.
     */
    @JsonProperty(required = true)
    private int lun;

    /**
     * Get the lun value.
     *
     * @return the lun value
     */
    public int getLun() {
        return this.lun;
    }

}