package com.omi.common.enums.medication;

import com.omi.common.enums.interfaces.DisplayableEnum;

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
    ADJUVANT("Adjuvant");

    private final String displayName;

    MedicationType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }
}
