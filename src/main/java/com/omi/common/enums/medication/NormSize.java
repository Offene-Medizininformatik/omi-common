package com.omi.common.enums.medication;

import com.omi.common.enums.interfaces.DisplayableEnum;

public enum NormSize implements DisplayableEnum {
    N1("N1"),
    N2("N2"),
    N3("N3"),
    NOT_APPLICABLE("Not applicable");

    private final String displayName;

    NormSize(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }
}