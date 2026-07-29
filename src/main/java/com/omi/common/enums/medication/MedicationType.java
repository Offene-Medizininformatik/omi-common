package com.omi.common.enums.medication;

import com.omi.common.enums.interfaces.DisplayableEnum;

// ! When changing anything here, make sure to also change the enum in the frontend
// src/app/medication/types/medication.ts 
public enum MedicationType implements DisplayableEnum {
    PHARMACEUTICAL("Arzneimittel"),
    MEDICAL_DEVICE("Medizinprodukt"),
    BANDAGE("Verbandmittel"),
    DIPSTICK("Teststreifen"),
    BALANCED_DIETETIC("Bilanzierte Diät"),
    VACCINE("Impfstoff"),
    ANIMAL_PHARMACEUTICAL("Tierarzneimittel"),
    MEDICAL_ACCESSORY("Medizinisches Zubehör"),
    ANTHROPOSOPHIC("Anthroposophisches Arzneimittel"),
    HOMEOPATHIC("Homöopathisches Arzneimittel"),
    DRUGS_OR_CHEMICAL("Droge/Chemikalie"),
    BIOCIDAL("Biozid"),
    COSMETIC("Kosmetikum"),
    CONTRACEPTIVE("Verhütungsmittel"),
    DIETARY_SUPPLEMENT("Nahrungsergänzungsmittel"),
    DIAGNOSTIC("Diagnostika"),
    PHYTOPHARMACEUTICAL("Phytopharmakon"),
    PLANT_PROTECTIVE("Pflanzenschutzmittel"),
    ADJUVANT("Hilfsmittel");

    private final String displayName;

    MedicationType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    public static MedicationType fromGerman(String germanValue) {
        if (germanValue == null || germanValue.isBlank()) {
            return null;
        }
        String normalizedValue = germanValue.trim();
        for (MedicationType type : values()) {
            if (type.displayName.equalsIgnoreCase(normalizedValue)) {
                return type;
            }
        }
        return null;
    }
}
