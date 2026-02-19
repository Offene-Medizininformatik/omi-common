package com.omi.common.dto.base;

import com.omi.common.enums.ingredient.IngredientType;
import lombok.Builder;

@Builder
public record Ingredient(
        String name,
        IngredientType type,
        Strength strength,
        IngredientCoding coding
) {
}
