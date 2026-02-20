package com.omi.common.dto.base;

import com.omi.common.enums.generic.Unit;
import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record Strength(
    BigDecimal from,
    BigDecimal to,
    Unit unit
) {}
