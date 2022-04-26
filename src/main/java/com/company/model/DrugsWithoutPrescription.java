package com.company.model;

public class DrugsWithoutPrescription extends Medicine{

    private boolean permissionRequired = false;

    public DrugsWithoutPrescription(String nameOfMedicine, String origin,
                                    TreatmentCategory treatmentCategory,
                                    double priceInUahPerPackage,
                                    Integer numberOfTabletsInPackage){
        super(nameOfMedicine, origin, treatmentCategory, priceInUahPerPackage, numberOfTabletsInPackage);
    }

    @Override
    public String getHeaders(){
        return super.getHeaders() + ", permission required";
    }

    @Override
    public String toCSV(){
        return super.toCSV() + "," + this.permissionRequired;
    }
}
