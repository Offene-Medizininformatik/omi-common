package com.omi.common.dto.arv;

public record ArvConditionDto(
        Integer ageFrom,
        Integer ageTo,
        String ageUnit,
        Integer targetSexKbv,
        boolean isEinschluss
) {}