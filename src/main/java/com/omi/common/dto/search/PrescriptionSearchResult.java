package com.omi.common.dto.search;

import java.math.BigDecimal;

public record PrescriptionSearchResult(
        String pzn,
        String packageName,
        String manufacturerName,
        String dosageForm,
        String packageSizeByDecree,
        BigDecimal packageQuantity,
        String packageUnit,
        BigDecimal pharmacyRetailPrice,
        BigDecimal copaymentAmount,
        String priceVsMaxReimbursement,
        String wirkstoff,
        String wirkstaerke,
        String atcCode,

        PrescriptionSearchFlags flags
) {
}
