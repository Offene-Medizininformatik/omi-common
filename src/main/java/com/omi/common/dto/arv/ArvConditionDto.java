package com.omi.common.dto.arv;

public record ArvConditionDto(
        Integer ageFrom,
        Integer ageTo,
        String ageUnit,
        String targetSexKbv,
        boolean isEinschluss
) {}