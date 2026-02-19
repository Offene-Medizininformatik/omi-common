package com.omi.common.dto.base;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record Pricing (
    BigDecimal retailPrice,
    BigDecimal patientPriceFixed,
    BigDecimal patientPriceContribution,
    BigDecimal patientPriceAdded,
    BigDecimal patientPriceTotal
) {}
