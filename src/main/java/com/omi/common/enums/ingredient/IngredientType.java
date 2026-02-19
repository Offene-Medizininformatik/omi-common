package com.omi.common.enums.ingredient;

import com.omi.common.enums.interfaces.DisplayableEnum;

public enum IngredientType implements DisplayableEnum {
    PRESERVATIVE("Preservative"),
    INGREDIENT("Ingredient"),
    EXTRACTANT("Extractant"),
    EXCIPIENT("Excipient"),
    ACTIVE_INGREDIENT("Active Ingredient"),
    BE("BE"),
    ACCORDING("According"),
    DYE("Dye"),
    EQUIVALENCE("Equivalence");

    private final String displayName;

    IngredientType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }
}
