/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.imagebuilder.v2020_02_14;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Runs the specified PowerShell on the VM (Windows). Corresponds to Packer
 * powershell provisioner. Exactly one of 'scriptUri' or 'inline' can be
 * specified.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = ImageTemplatePowerShellCustomizer.class)
@JsonTypeName("PowerShell")
public class ImageTemplatePowerShellCustomizer extends ImageTemplateCustomizer {
    /**
     * URI of the PowerShell script to be run for customizing. It can be a
     * github link, SAS URI for Azure Storage, etc.
     */
    @JsonProperty(value = "scriptUri")
    private String scriptUri;

    /**
     * SHA256 checksum of the power shell script provided in the scriptUri
     * field above.
     */
    @JsonProperty(value = "sha256Checksum")
    private String sha256Checksum;

    /**
     * Array of PowerShell commands to execute.
     */
    @JsonProperty(value = "inline")
    private List<String> inline;

    /**
     * If specified, the PowerShell script will be run with elevated
     * privileges.
     */
    @JsonProperty(value = "runElevated")
    private Boolean runElevated;

    /**
     * Valid exit codes for the PowerShell script. [Default: 0].
     */
    @JsonProperty(value = "validExitCodes")
    private List<Integer> validExitCodes;

    /**
     * Get uRI of the PowerShell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc.
     *
     * @return the scriptUri value
     */
    public String scriptUri() {
        return this.scriptUri;
    }

    /**
     * Set uRI of the PowerShell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc.
     *
     * @param scriptUri the scriptUri value to set
     * @return the ImageTemplatePowerShellCustomizer object itself.
     */
    public ImageTemplatePowerShellCustomizer withScriptUri(String scriptUri) {
        this.scriptUri = scriptUri;
        return this;
    }

    /**
     * Get sHA256 checksum of the power shell script provided in the scriptUri field above.
     *
     * @return the sha256Checksum value
     */
    public String sha256Checksum() {
        return this.sha256Checksum;
    }

    /**
     * Set sHA256 checksum of the power shell script provided in the scriptUri field above.
     *
     * @param sha256Checksum the sha256Checksum value to set
     * @return the ImageTemplatePowerShellCustomizer object itself.
     */
    public ImageTemplatePowerShellCustomizer withSha256Checksum(String sha256Checksum) {
        this.sha256Checksum = sha256Checksum;
        return this;
    }

    /**
     * Get array of PowerShell commands to execute.
     *
     * @return the inline value
     */
    public List<String> inline() {
        return this.inline;
    }

    /**
     * Set array of PowerShell commands to execute.
     *
     * @param inline the inline value to set
     * @return the ImageTemplatePowerShellCustomizer object itself.
     */
    public ImageTemplatePowerShellCustomizer withInline(List<String> inline) {
        this.inline = inline;
        return this;
    }

    /**
     * Get if specified, the PowerShell script will be run with elevated privileges.
     *
     * @return the runElevated value
     */
    public Boolean runElevated() {
        return this.runElevated;
    }

    /**
     * Set if specified, the PowerShell script will be run with elevated privileges.
     *
     * @param runElevated the runElevated value to set
     * @return the ImageTemplatePowerShellCustomizer object itself.
     */
    public ImageTemplatePowerShellCustomizer withRunElevated(Boolean runElevated) {
        this.runElevated = runElevated;
        return this;
    }

    /**
     * Get valid exit codes for the PowerShell script. [Default: 0].
     *
     * @return the validExitCodes value
     */
    public List<Integer> validExitCodes() {
        return this.validExitCodes;
    }

    /**
     * Set valid exit codes for the PowerShell script. [Default: 0].
     *
     * @param validExitCodes the validExitCodes value to set
     * @return the ImageTemplatePowerShellCustomizer object itself.
     */
    public ImageTemplatePowerShellCustomizer withValidExitCodes(List<Integer> validExitCodes) {
        this.validExitCodes = validExitCodes;
        return this;
    }

}
