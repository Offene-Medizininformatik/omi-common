package com.omi.common.dto.properties;

import lombok.Builder;

@Builder
public record MedicationProperties(
        String gbaDecreeUrl
) {
}
