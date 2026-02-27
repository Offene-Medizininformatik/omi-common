package com.omi.common.dto.base;

import com.omi.common.enums.medication.NormSize;
import lombok.Builder;

@Builder
public record AlternativePackage (
        String pzn,
        Double quantityUnitAmount,
        Double quantityBaseFactor,
        Double quantityMultiplierFactor,
        String itemType,
        NormSize normSize
)
{}
