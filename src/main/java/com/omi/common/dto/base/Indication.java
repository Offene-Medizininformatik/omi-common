package com.omi.common.dto.base;

import lombok.Builder;

@Builder
public record Indication(
        String icdCode,
        String icdDescription
) {
}
