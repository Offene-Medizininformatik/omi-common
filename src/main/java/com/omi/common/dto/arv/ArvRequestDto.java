package com.omi.common.dto.arv;

public record ArvRequestDto(
        String pzn,
        Double price,
        String kvCode,
        String specialty
) {}