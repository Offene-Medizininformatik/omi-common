package com.omi.common.enums.utils;

import com.omi.common.enums.interfaces.DisplayableEnum;

public class EnumUtils {
    public static <T extends Enum<T> & DisplayableEnum> T fromString(Class<T> enumClass, String value) {
        if (value == null || value.isBlank()) {
            return null;
        }
        for (T constant : enumClass.getEnumConstants()) {
            if (constant.getDisplayName().equalsIgnoreCase(value)
                    || constant.name().equalsIgnoreCase(value)) {
                return constant;
            }
        }
        return null;
    }
}
