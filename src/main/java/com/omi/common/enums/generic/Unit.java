package com.omi.common.enums.generic;

import com.omi.common.enums.interfaces.DisplayableEnum;

import java.util.Map;

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

    private static final Map<String, Unit> GERMAN_MAPPING = Map.of(
            "g", GRAM,
            "mg", MILLIGRAM,
            "mg/d", MILLIGRAM_PER_DAY,
            "µg", MICROGRAM,
            "i.e.", INTERNATIONAL_UNIT,
            "mio. i.e.", MILLION_INTERNATIONAL_UNIT,
            "e.", UNIT,
            "ph.eur.-einheit", EUROPEAN_PHARMACOPOEIA_UNIT,
            "be", BREAD_UNIT,
            "mio. zellen", MILLION_CELL_UNIT
    );

    public static Unit fromGerman(String germanValue) {
        if (germanValue == null || germanValue.isBlank()) {
            return null;
        }
        return GERMAN_MAPPING.get(germanValue.toLowerCase().trim());
    }
}
