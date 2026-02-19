package com.omi.common.dto.base;

import lombok.Builder;

@Builder
public record IngredientCoding (
    String ask,
    String atc,
    String atcName
) {}
