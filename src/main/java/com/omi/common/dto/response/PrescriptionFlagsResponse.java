package com.omi.common.dto.response;

public record PrescriptionFlagsResponse(
        boolean isNarcotic,
        boolean isTprescriptionDrug
) {
}
