package com.omi.common.dto.arv.iww;

import java.util.List;

public record IwwIndicationDto(
        Long id,
        String name,
        String description,
        String shortName,
        List<IwwDocumentDto> documents,
        List<IwwMoleculeDto> molecules,
        List<IwwIndicationDto> children
) {
}