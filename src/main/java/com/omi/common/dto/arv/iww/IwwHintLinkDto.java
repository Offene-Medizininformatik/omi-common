package com.omi.common.dto.arv.iww;

import java.util.List;

public record IwwHintLinkDto(
        Long id,
        String atcCode,
        String description,
        Long categoryId,
        List<IwwPharmFormDto> pharmForms,
        List<String> pzns
) {
}