package com.company.model;

public class PrescriptionDrugs extends Medicine{

     private boolean permissionRequired = true;

    public PrescriptionDrugs(String nameOfMedicine, String origin,
                              TreatmentCategory treatmentCategory,
                              double priceInUahPerPackage,
                              Integer numberOfTabletsInPackage){
        super(nameOfMedicine, origin, treatmentCategory, priceInUahPerPackage, numberOfTabletsInPackage);
    }


}
