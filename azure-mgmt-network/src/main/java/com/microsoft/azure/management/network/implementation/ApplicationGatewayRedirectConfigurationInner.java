/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.management.network.ApplicationGatewayRedirectType;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Redirect configuration of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayRedirectConfigurationInner extends SubResource {
    /**
     * Supported http redirection types - Permanent, Temporary, Found,
     * SeeOther. Possible values include: 'Permanent', 'Found', 'SeeOther',
     * 'Temporary'.
     */
    @JsonProperty(value = "properties.redirectType")
    private ApplicationGatewayRedirectType redirectType;

    /**
     * Reference to a listener to redirect the request to.
     */
    @JsonProperty(value = "properties.targetListener")
    private SubResource targetListener;

    /**
     * Url to redirect the request to.
     */
    @JsonProperty(value = "properties.targetUrl")
    private String targetUrl;

    /**
     * Include path in the redirected url.
     */
    @JsonProperty(value = "properties.includePath")
    private Boolean includePath;

    /**
     * Include query string in the redirected url.
     */
    @JsonProperty(value = "properties.includeQueryString")
    private Boolean includeQueryString;

    /**
     * Request routing specifying redirect configuration.
     */
    @JsonProperty(value = "properties.requestRoutingRules")
    private List<SubResource> requestRoutingRules;

    /**
     * Url path maps specifying default redirect configuration.
     */
    @JsonProperty(value = "properties.urlPathMaps")
    private List<SubResource> urlPathMaps;

    /**
     * Path rules specifying redirect configuration.
     */
    @JsonProperty(value = "properties.pathRules")
    private List<SubResource> pathRules;

    /**
     * Name of the resource that is unique within a resource group. This name
     * can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the redirectType value.
     *
     * @return the redirectType value
     */
    public ApplicationGatewayRedirectType redirectType() {
        return this.redirectType;
    }

    /**
     * Set the redirectType value.
     *
     * @param redirectType the redirectType value to set
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withRedirectType(ApplicationGatewayRedirectType redirectType) {
        this.redirectType = redirectType;
        return this;
    }

    /**
     * Get the targetListener value.
     *
     * @return the targetListener value
     */
    public SubResource targetListener() {
        return this.targetListener;
    }

    /**
     * Set the targetListener value.
     *
     * @param targetListener the targetListener value to set
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withTargetListener(SubResource targetListener) {
        this.targetListener = targetListener;
        return this;
    }

    /**
     * Get the targetUrl value.
     *
     * @return the targetUrl value
     */
    public String targetUrl() {
        return this.targetUrl;
    }

    /**
     * Set the targetUrl value.
     *
     * @param targetUrl the targetUrl value to set
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }

    /**
     * Get the includePath value.
     *
     * @return the includePath value
     */
    public Boolean includePath() {
        return this.includePath;
    }

    /**
     * Set the includePath value.
     *
     * @param includePath the includePath value to set
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withIncludePath(Boolean includePath) {
        this.includePath = includePath;
        return this;
    }

    /**
     * Get the includeQueryString value.
     *
     * @return the includeQueryString value
     */
    public Boolean includeQueryString() {
        return this.includeQueryString;
    }

    /**
     * Set the includeQueryString value.
     *
     * @param includeQueryString the includeQueryString value to set
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withIncludeQueryString(Boolean includeQueryString) {
        this.includeQueryString = includeQueryString;
        return this;
    }

    /**
     * Get the requestRoutingRules value.
     *
     * @return the requestRoutingRules value
     */
    public List<SubResource> requestRoutingRules() {
        return this.requestRoutingRules;
    }

    /**
     * Set the requestRoutingRules value.
     *
     * @param requestRoutingRules the requestRoutingRules value to set
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withRequestRoutingRules(List<SubResource> requestRoutingRules) {
        this.requestRoutingRules = requestRoutingRules;
        return this;
    }

    /**
     * Get the urlPathMaps value.
     *
     * @return the urlPathMaps value
     */
    public List<SubResource> urlPathMaps() {
        return this.urlPathMaps;
    }

    /**
     * Set the urlPathMaps value.
     *
     * @param urlPathMaps the urlPathMaps value to set
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withUrlPathMaps(List<SubResource> urlPathMaps) {
        this.urlPathMaps = urlPathMaps;
        return this;
    }

    /**
     * Get the pathRules value.
     *
     * @return the pathRules value
     */
    public List<SubResource> pathRules() {
        return this.pathRules;
    }

    /**
     * Set the pathRules value.
     *
     * @param pathRules the pathRules value to set
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withPathRules(List<SubResource> pathRules) {
        this.pathRules = pathRules;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the ApplicationGatewayRedirectConfigurationInner object itself.
     */
    public ApplicationGatewayRedirectConfigurationInner withType(String type) {
        this.type = type;
        return this;
    }

}