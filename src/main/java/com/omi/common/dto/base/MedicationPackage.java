package com.omi.common.dto.base;

import com.omi.common.enums.medication.NormSize;

public record MedicationPackage(
        Double itemCount,
        String itemType,
        NormSize normSize
) {
}
