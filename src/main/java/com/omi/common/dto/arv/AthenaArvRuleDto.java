package com.omi.common.dto.arv;

import java.util.List;

public record AthenaArvRuleDto(
        Long arvId,
        int arvTypeId,
        int priority,

        String hintText,

        Double targetPrice,
        Double quoteDdd,
        Double quotePrescription,
        Double quoteGross,
        String iwwClassification,

        Integer priceMin,
        Integer priceMax,

        Integer dddAmount,
        Integer desiredFlag,
        Long iwwCategory,

        Long alternativePackageGroupId,
        List<String> alternativePzns,
        List<String> documentUrls,

        ArvConditionDto condition
) {}