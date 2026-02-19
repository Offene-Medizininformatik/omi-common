package com.omi.common.enums.medication;

import com.omi.common.enums.interfaces.DisplayableEnum;

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
}
