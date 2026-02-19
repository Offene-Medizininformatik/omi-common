package com.omi.common.enums.generic;

import com.omi.common.enums.interfaces.DisplayableEnum;

public enum Unit implements DisplayableEnum {
    GRAM("g"),
    MILLIGRAM("mg"),
    MILLIGRAM_PER_DAY("mg/d"),
    MICROGRAM("µg"),
    INTERNATIONAL_UNIT("IU"),
    MILLION_INTERNATIONAL_UNIT("MIU"),
    UNIT("unit"),
    EUROPEAN_PHARMACOPOEIA_UNIT("EPU"),
    BREAD_UNIT("BE"),
    MILLION_CELL_UNIT("MCU");

    private final String displayName;

    Unit(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }
}
