/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.notificationhubs.models;

import com.microsoft.windowsazure.core.LazyHashMap;

import java.util.HashMap;

/**
* Parameters supplied to the Check Name Availability for Namespace and
* NotificationHubs.
*/
public class CheckAvailabilityParameters {
    private boolean isAvailable;
    
    /**
    * Optional. Gets or sets true if the name is available and can be used to
    * create new Namespace/NotificationHub. Otherwise false.
    * @return The IsAvailable value.
    */
    public boolean isAvailable() {
        return this.isAvailable;
    }
    
    /**
    * Optional. Gets or sets true if the name is available and can be used to
    * create new Namespace/NotificationHub. Otherwise false.
    * @param isAvailableValue The IsAvailable value.
    */
    public void setIsAvailable(final boolean isAvailableValue) {
        this.isAvailable = isAvailableValue;
    }
    
    private String location;
    
    /**
    * Optional. Gets or sets location.
    * @return The Location value.
    */
    public String getLocation() {
        return this.location;
    }
    
    /**
    * Optional. Gets or sets location.
    * @param locationValue The Location value.
    */
    public void setLocation(final String locationValue) {
        this.location = locationValue;
    }
    
    private String name;
    
    /**
    * Required. Gets or sets name
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Required. Gets or sets name
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private HashMap<String, String> tags;
    
    /**
    * Optional. Gets or sets tags.
    * @return The Tags value.
    */
    public HashMap<String, String> getTags() {
        return this.tags;
    }
    
    /**
    * Optional. Gets or sets tags.
    * @param tagsValue The Tags value.
    */
    public void setTags(final HashMap<String, String> tagsValue) {
        this.tags = tagsValue;
    }
    
    /**
    * Initializes a new instance of the CheckAvailabilityParameters class.
    *
    */
    public CheckAvailabilityParameters() {
        this.setTags(new LazyHashMap<String, String>());
    }
    
    /**
    * Initializes a new instance of the CheckAvailabilityParameters class with
    * required arguments.
    *
    * @param name Gets or sets name
    */
    public CheckAvailabilityParameters(String name) {
        this();
        if (name == null) {
            throw new NullPointerException("name");
        }
        this.setName(name);
    }
}