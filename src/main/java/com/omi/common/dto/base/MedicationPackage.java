package com.omi.common.dto.base;

import com.omi.common.enums.medication.NormSize;
import lombok.Builder;

@Builder
public record MedicationPackage(
        Double itemCount,
        String itemType,
        NormSize normSize
) {
}
