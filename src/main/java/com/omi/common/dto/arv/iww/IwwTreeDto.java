package com.omi.common.dto.arv.iww;

import java.util.List;

public record IwwTreeDto(
        IwwMetadataDto metadata,
        List<IwwCategoryDto>categories,
        List<IwwIndicationDto> indication
) {
}
