package com.omi.common.enums.medication;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedicationTypeTest {

    @Test
    void exposesCanonicalProductTypeIdentifiersInDeclarationOrder() {
        assertEquals(
                List.of(
                        "PHARMACEUTICAL",
                        "MEDICAL_DEVICE",
                        "BANDAGE",
                        "DIPSTICK",
                        "BALANCED_DIETETIC",
                        "VACCINE",
                        "ANIMAL_PHARMACEUTICAL",
                        "MEDICAL_ACCESSORY",
                        "ANTHROPOSOPHIC",
                        "HOMEOPATHIC",
                        "DRUGS_OR_CHEMICAL",
                        "BIOCIDAL",
                        "COSMETIC",
                        "CONTRACEPTIVE",
                        "DIETARY_SUPPLEMENT",
                        "DIAGNOSTIC",
                        "PHYTOPHARMACEUTICAL",
                        "PLANT_PROTECTIVE",
                        "ADJUVANT"),
                Arrays.stream(MedicationType.values()).map(Enum::name).toList());
    }

    @Test
    void exposesGermanDisplayLabelsAndUsesThemForParsing() {
        assertEquals("Tierarzneimittel", MedicationType.ANIMAL_PHARMACEUTICAL.getDisplayName());
        assertEquals("Medizinisches Zubehör", MedicationType.MEDICAL_ACCESSORY.getDisplayName());
        assertEquals("Homöopathisches Arzneimittel", MedicationType.HOMEOPATHIC.getDisplayName());
        assertEquals("Nahrungsergänzungsmittel", MedicationType.DIETARY_SUPPLEMENT.getDisplayName());
        for (MedicationType type : MedicationType.values()) {
            assertEquals(type, MedicationType.fromGerman(type.getDisplayName()));
        }
    }
}
