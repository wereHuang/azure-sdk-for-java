/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.17.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The certificate issuer update parameters.
 */
public class CertificateIssuerUpdateParameters {
    /**
     * The issuer provider.
     */
    private String provider;

    /**
     * The credentials to be used for the issuer.
     */
    private IssuerCredentials credentials;

    /**
     * Details of the organization as provided to the issuer.
     */
    @JsonProperty(value = "org_details")
    private OrganizationDetails organizationDetails;

    /**
     * Attributes of the issuer object.
     */
    private IssuerAttributes attributes;

    /**
     * Get the provider value.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider value.
     *
     * @param provider the provider value to set
     * @return the CertificateIssuerUpdateParameters object itself.
     */
    public CertificateIssuerUpdateParameters withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the credentials value.
     *
     * @return the credentials value
     */
    public IssuerCredentials credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials value.
     *
     * @param credentials the credentials value to set
     * @return the CertificateIssuerUpdateParameters object itself.
     */
    public CertificateIssuerUpdateParameters withCredentials(IssuerCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the organizationDetails value.
     *
     * @return the organizationDetails value
     */
    public OrganizationDetails organizationDetails() {
        return this.organizationDetails;
    }

    /**
     * Set the organizationDetails value.
     *
     * @param organizationDetails the organizationDetails value to set
     * @return the CertificateIssuerUpdateParameters object itself.
     */
    public CertificateIssuerUpdateParameters withOrganizationDetails(OrganizationDetails organizationDetails) {
        this.organizationDetails = organizationDetails;
        return this;
    }

    /**
     * Get the attributes value.
     *
     * @return the attributes value
     */
    public IssuerAttributes attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes value.
     *
     * @param attributes the attributes value to set
     * @return the CertificateIssuerUpdateParameters object itself.
     */
    public CertificateIssuerUpdateParameters withAttributes(IssuerAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

}
