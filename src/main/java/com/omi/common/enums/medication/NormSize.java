package com.omi.common.enums.medication;

import com.omi.common.enums.interfaces.DisplayableEnum;

import java.util.Map;

public enum NormSize implements DisplayableEnum {
    N1("N1"),
    N2("N2"),
    N3("N3"),
    INSTITUTIONAL_PACKAGING("Institutional packaging"),
    NO_THERAPEUTICALLY_APPROPRIATE_PACKAGING_SIZE("No therapeutically appropriate packaging size"),
    NOT_APPLICABLE("Not applicable");

    private final String displayName;

    NormSize(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    private static final Map<String, NormSize> GERMAN_MAPPING = Map.of(
            "n1", N1,
            "n2", N2,
            "n3", N3,
            "anstaltspackung", INSTITUTIONAL_PACKAGING,
            "keine therapiegerechte packungsgröße", NO_THERAPEUTICALLY_APPROPRIATE_PACKAGING_SIZE,
            "nicht betroffen", NOT_APPLICABLE
    );

    public static NormSize fromGerman(String germanValue) {
        if (germanValue == null || germanValue.isBlank()) {
            return null;
        }
        return GERMAN_MAPPING.get(germanValue.toLowerCase().trim());
    }

    public static String toGerman(NormSize normSize) {
        if (normSize == null || normSize.getDisplayName().isBlank()) {
            return null;
        }
        return GERMAN_MAPPING
                .entrySet()
                .stream()
                .filter( entry -> entry.getValue() == normSize)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }
}