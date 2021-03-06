/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DisasterRecoveryConfigurationFailoverPolicy.
 */
public final class DisasterRecoveryConfigurationFailoverPolicy extends ExpandableStringEnum<DisasterRecoveryConfigurationFailoverPolicy> {
    /** Static value Manual for DisasterRecoveryConfigurationFailoverPolicy. */
    public static final DisasterRecoveryConfigurationFailoverPolicy MANUAL = fromString("Manual");

    /** Static value Automatic for DisasterRecoveryConfigurationFailoverPolicy. */
    public static final DisasterRecoveryConfigurationFailoverPolicy AUTOMATIC = fromString("Automatic");

    /**
     * Creates or finds a DisasterRecoveryConfigurationFailoverPolicy from its string representation.
     * @param name a name to look for
     * @return the corresponding DisasterRecoveryConfigurationFailoverPolicy
     */
    @JsonCreator
    public static DisasterRecoveryConfigurationFailoverPolicy fromString(String name) {
        return fromString(name, DisasterRecoveryConfigurationFailoverPolicy.class);
    }

    /**
     * @return known DisasterRecoveryConfigurationFailoverPolicy values
     */
    public static Collection<DisasterRecoveryConfigurationFailoverPolicy> values() {
        return values(DisasterRecoveryConfigurationFailoverPolicy.class);
    }
}
