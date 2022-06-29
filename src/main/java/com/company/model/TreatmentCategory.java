package com.company.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum TreatmentCategory {
    ANTIVIRAL("antiviral"),
    ANALGESICS("analgesics"),
    VITAMINS("vitamins"),
    ANTIBIOTICS("antibiotics");

    private final String category;
    private TreatmentCategory(String category){
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    @JsonCreator
    public static TreatmentCategory getTreatmentCategory(String value) {

        for (TreatmentCategory treatmentCategory : TreatmentCategory.values()) {

            if (treatmentCategory.getCategory().equals(value)) {

                return treatmentCategory;
            }
        }
        return null;
    }
}
