package com.omi.common.enums.arv;

import lombok.Getter;

@Getter
public enum ArvType {
    LEITSUBSTANZ(1),
    BIOSIMILAR(2),
    GENERIKA(3),
    KOSTENVERGLEICH_DDD(4),
    ME_TOO(5),
    ZIELPREIS(6),
    INFOMASSNAHME(7),
    QUALITAETSSICHERUNG(8),
    STUDIENREGELUNG(9),
    BEHANDLUNGSALTERNATIVE(10),
    THERAPIEHINWEIS(11),
    HOECHSTQUOTE(12),
    RABATTLISTEN(13),
    TEILBARKEITSLISTEN(14),
    IWW(15),
    KOMBI_VERORDNUNGSZIEL(16);

    private final int id;
    ArvType(int id) {
        this.id = id;
    }

    public static ArvType fromId(int id) {
        for (ArvType type : values()) {
            if (type.id == id) return type;
        }
        return null;
    }
}