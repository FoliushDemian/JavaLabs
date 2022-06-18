package com.company.model;

import java.util.Objects;

public class PrescriptionDrugs extends Medicine {

    private boolean permissionRequired = true;

    public PrescriptionDrugs(String nameOfMedicine, String origin,
                              TreatmentCategory treatmentCategory,
                              double priceInUahPerPackage,
                              Integer numberOfTabletsInPackage) {
        super(nameOfMedicine, origin, treatmentCategory, priceInUahPerPackage, numberOfTabletsInPackage);
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", permission required";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + permissionRequired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PrescriptionDrugs that = (PrescriptionDrugs) o;
        return permissionRequired == that.permissionRequired;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), permissionRequired);
    }
}
