package com.omi.common.dto.arv.iww;

import java.util.List;

public record IwwMoleculeDto(
        Long id,
        String name,
        Long categoryId,
        List<IwwAtcDto> atcs,
        List<IwwPharmFormDto> pharmForms,
        List<IwwDocumentDto> documents,
        List<String> pzns,
        List<IwwHintDto> hints
) {
}