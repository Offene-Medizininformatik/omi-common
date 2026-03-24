package com.omi.common.dto.arv.iww;

public record IwwMetadataDto(
        String name,
        String description,
        String source,
        String sourceArticle,
        String copyright,
        String categoryName,
        String categoryNameShort,
        String hintsName,
        String indicationTreeName,
        String logo32x32,
        String logo48x48,
        String logo114x114
) {
}