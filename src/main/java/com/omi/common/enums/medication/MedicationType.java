package com.omi.common.enums.medication;

import com.omi.common.enums.interfaces.DisplayableEnum;

import java.util.Map;

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

    private static final Map<String, MedicationType> GERMAN_MAPPING = Map.ofEntries(
            Map.entry("arzneimittel", PHARMACEUTICAL),
            Map.entry("medizinprodukt", MEDICAL_DEVICE),
            Map.entry("verbandmittel", BANDAGE),
            Map.entry("teststreifen", DIPSTICK),
            Map.entry("bilanzierte diät", BALANCED_DIETETIC),
            Map.entry("impfstoff", VACCINE),
            Map.entry("tierarzneimittel", ANIMAL_PHARMACEUTICAL),
            Map.entry("veterinärprodukt", ANIMAL_PHARMACEUTICAL),
            Map.entry("medizinisches zubehör", MEDICAL_ACCESSORY),
            Map.entry("anthroposophisches arzneimittel", ANTHROPOSOPHIC),
            Map.entry("homöopathisches arzneimittel", HOMEOPATHIC),
            Map.entry("homeopathisches arzneimittel", HOMEOPATHIC),
            Map.entry("droge/chemikalie", DRUGS_OR_CHEMICAL),
            Map.entry("biozid", BIOCIDAL),
            Map.entry("kosmetikum", COSMETIC),
            Map.entry("verhütungsmittel", CONTRACEPTIVE),
            Map.entry("nahrungsergänzungsmittel", DIETARY_SUPPLEMENT),
            Map.entry("nahrungergänzungsmittel", DIETARY_SUPPLEMENT),
            Map.entry("diagnostika", DIAGNOSTIC),
            Map.entry("phytopharmakon", PHYTOPHARMACEUTICAL),
            Map.entry("pflanzenschutzmittel", PLANT_PROTECTIVE),
            Map.entry("hilfsmittel", ADJUVANT)
    );

    public static MedicationType fromGerman(String germanValue) {
        if (germanValue == null || germanValue.isBlank()) {
            return null;
        }
        return GERMAN_MAPPING.get(germanValue.toLowerCase().trim());
    }
}
