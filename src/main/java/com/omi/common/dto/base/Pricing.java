package com.omi.common.dto.base;

import java.math.BigDecimal;

public record Pricing (
    BigDecimal retailPrice,
    BigDecimal patientPriceFixed,
    BigDecimal patientPriceContribution,
    BigDecimal patientPriceAdded,
    BigDecimal patientPriceTotal
) {}
