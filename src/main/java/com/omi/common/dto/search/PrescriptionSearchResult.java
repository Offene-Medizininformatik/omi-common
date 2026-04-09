package com.omi.common.dto.search;

import java.math.BigDecimal;

public record PrescriptionSearchResult(
        String pzn,
        String packageName,
        String manufacturerName,
        String dosageForm,
        String packageSizeByDecree,
        BigDecimal packageQuantityUnitAmount,
        BigDecimal packageQuantityBaseFactor,
        BigDecimal packageQuantityMultiplierFactor,
        BigDecimal packageQuantityCalculated,
        String packageUnit,
        String salesStatusCode,
        BigDecimal pharmacyRetailPrice,
        BigDecimal copaymentAmount,
        String priceVsMaxReimbursement,
        String wirkstoff,
        String wirkstaerke,
        BigDecimal wirkstaerkeSort,
        String atcCode,
        PrescriptionSearchFlags flags
) {
}
