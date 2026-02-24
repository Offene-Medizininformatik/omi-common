package com.omi.common.enums.medication;

import com.omi.common.enums.interfaces.DisplayableEnum;

import java.util.Map;

public enum MedicationType implements DisplayableEnum {
    PHARMACEUTICAL("Pharmaceutical"),
    MEDICAL_DEVICE("Medical Device"),
    BANDAGE("Bandage"),
    DIPSTICK("Dipstick"),
    BALANCED_DIETETIC("Balanced Dietetic"),
    VACCINE("Vaccine"),
    VETERINARY_PRODUCT("Veterinary Product"),
    ANTHROPOSOPHIC("Anthroposophic"),
    HOMEOPATHIC("Homeopathic"),
    DRUGS_OR_CHEMICAL("Drugs or Chemical"),
    BIOCIDAL("Biocidal"),
    COSMETIC("Cosmetic"),
    CONTRACEPTIVE("Contraceptive"),
    DIETARY_SUPPLEMENT("Dietary Supplement"),
    DIAGNOSTIC("Diagnostic"),
    PHYTOPHARMACEUTICAL("Phytopharmaceutical"),
    PLANT_PROTECTIVE("Plant Protective"),
    ADJUVANT("Adjuvant"),
    COMBINATION_PACK("Combination Package");

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
            Map.entry("veterinärprodukt", VETERINARY_PRODUCT),
            Map.entry("anthroposophisches arzneimittel", ANTHROPOSOPHIC),
            Map.entry("homöopathisches arzneimittel", HOMEOPATHIC),
            Map.entry("homeopathisches arzneimittel", HOMEOPATHIC),
            Map.entry("droge/chemikalie", DRUGS_OR_CHEMICAL),
            Map.entry("biozid", BIOCIDAL),
            Map.entry("kosmetikum", COSMETIC),
            Map.entry("verhütungsmittel", CONTRACEPTIVE),
            Map.entry("nahrungsergänzungsmittel", DIETARY_SUPPLEMENT),
            Map.entry("diagnostika", DIAGNOSTIC),
            Map.entry("phytopharmakon", PHYTOPHARMACEUTICAL),
            Map.entry("pflanzenschutzmittel", PLANT_PROTECTIVE),
            Map.entry("hilfsmittel", ADJUVANT),
            Map.entry("kombipackung", COMBINATION_PACK)
    );

    public static MedicationType fromGerman(String germanValue) {
        if (germanValue == null || germanValue.isBlank()) {
            return null;
        }
        return GERMAN_MAPPING.get(germanValue.toLowerCase().trim());
    }
}
