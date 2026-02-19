package com.omi.common.dto.flags;

import lombok.Builder;

@Builder
public record MedicationFlags(
        boolean gbaDecree,
        boolean excludedFromPrescription,
        boolean limitedFromPrescription,
        boolean negativeList,
        boolean lifestylePrescription,
        boolean limitedLifestylePrescription,
        boolean otc,
        boolean mandatoryPrescription,
        boolean mandatoryPharmacy,
        boolean gbaTherapeuticNote,
        boolean cheapAlternativeAvailable,
        boolean discountAlternativeAvailable,
        boolean medicalDevice,
        boolean medicalBandaid,
        boolean importMedication,
        boolean redHandLetter,
        boolean blueHandLetter
) {
}
