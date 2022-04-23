package com.company.model;

public class DrugsWithoutPrescription extends Medicine{

    private boolean permissionRequired = false;

    public DrugsWithoutPrescription(String nameOfMedicine, String origin,
                                    TreatmentCategory treatmentCategory,
                                    double priceInUahPerPackage,
                                    Integer numberOfTabletsInPackage){
        super(nameOfMedicine, origin, treatmentCategory, priceInUahPerPackage, numberOfTabletsInPackage);
    }
}
