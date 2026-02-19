package com.omi.common.dto.response;

import com.omi.common.dto.base.*;
import com.omi.common.dto.flags.MedicationFlags;
import com.omi.common.dto.properties.MedicationProperties;
import com.omi.common.enums.medication.MedicationType;
import com.omi.common.enums.medication.SaleStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.util.List;

@Builder
public record MedicationResponse(
        String name,
        MedicationType type,
        String manufacturer,
        String pzn,

        @JsonProperty("package")
        MedicationPackage packageInfo,

        SaleStatus saleStatus,
        List<Ingredient> ingredients,
        Pricing pricing,
        List<Indication> indications,
        List<CounterIndication> counterIndications,
        MedicationFlags flags,
        MedicationProperties properties
) {
}
