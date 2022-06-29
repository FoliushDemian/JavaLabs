package com.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;


@Entity
@Table(name = "drugsWithoutPrescription")
public class DrugsWithoutPrescription extends Medicine {

    @Column(name = "permission_required", nullable = false)
    private boolean permissionRequired = false;

    public DrugsWithoutPrescription(String nameOfMedicine, String origin,
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
        return super.toCSV() + "," + this.permissionRequired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DrugsWithoutPrescription that = (DrugsWithoutPrescription) o;
        return permissionRequired == that.permissionRequired;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), permissionRequired);
    }

    public boolean isPermissionRequired() {
        return permissionRequired;
    }

    public void setPermissionRequired(boolean permissionRequired) {
        this.permissionRequired = permissionRequired;
    }
}
