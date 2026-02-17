package com.omi.common.dto.search;

public record PrescriptionSearchFlags(
        boolean isNarcotic,
        boolean isReserveAntibiotic,
        boolean isTprescriptionDrug,
        boolean hasPrescriptionRestrictionAnnexIii,
        boolean hasPrescriptionExclusionAnnexIii,
        boolean flagArv,
        boolean flagHasDiscount
) {
}
