package com.omi.common.dto.arv.iww;

import java.util.List;

public record IwwHintDto(Long id, int seqNo, String description, List<IwwHintLinkDto> links) {
}