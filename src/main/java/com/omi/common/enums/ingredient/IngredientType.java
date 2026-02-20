package com.omi.common.enums.ingredient;

import com.omi.common.enums.interfaces.DisplayableEnum;

import java.util.Map;

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

    private static final Map<String, IngredientType> GERMAN_MAPPING = Map.of(
            "konservierungsmittel", PRESERVATIVE,
            "inhaltsstoff/zutaten", INGREDIENT,
            "extraktionsmittel", EXTRACTANT,
            "hilfsstoff", EXCIPIENT,
            "wirkstoff", ACTIVE_INGREDIENT,
            "be", BE,
            "entsprechend", ACCORDING,
            "farbstoff", DYE,
            "äquivalenz", EQUIVALENCE
    );

    public static IngredientType fromGerman(String germanValue) {
        if (germanValue == null || germanValue.isBlank()) {
            return null;
        }
        return GERMAN_MAPPING.get(germanValue.toLowerCase().trim());
    }
}
