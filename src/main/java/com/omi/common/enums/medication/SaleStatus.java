package com.omi.common.enums.medication;

import com.omi.common.enums.interfaces.DisplayableEnum;

import java.util.Map;

public enum SaleStatus implements DisplayableEnum {
    DISCONTINUED("Discontinued"),
    ACTIVE("Active");

    private final String displayName;

    SaleStatus(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    private static final Map<String, SaleStatus> GERMAN_MAPPING = Map.of(
            "außer vertrieb", DISCONTINUED,
            "im vertrieb", ACTIVE
    );

    public static SaleStatus fromGerman(String german) {
        return GERMAN_MAPPING.get(german.toLowerCase().trim());
    }
}
