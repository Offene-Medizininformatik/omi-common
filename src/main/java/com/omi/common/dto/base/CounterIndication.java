package com.omi.common.dto.base;

import lombok.Builder;

@Builder
public record CounterIndication(
        String description
) {
}
