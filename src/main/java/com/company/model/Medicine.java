package com.company.model;
import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public class Medicine {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false, name = "name_of_medicine")
    private String nameOfMedicine;

    @Column(nullable = false, name = "origin")
    private String origin;

    @Column(nullable = false, name = "treatment_category")
    private TreatmentCategory treatmentCategory;

    @Column(nullable = false, name = "price")
    private double priceInUahPerPackage;

    @Column(nullable = false, name = "number_of_tablets")
    private Integer numberOfTabletsInPackage;

    public Medicine(String nameOfMedicine, String origin, TreatmentCategory treatmentCategory,
                    double priceInUahPerPackage, Integer numberOfTabletsInPackage) {
        this.nameOfMedicine = nameOfMedicine;
        this.origin = origin;
        this.treatmentCategory = treatmentCategory;
        this.priceInUahPerPackage = priceInUahPerPackage;
        this.numberOfTabletsInPackage = numberOfTabletsInPackage;
    }
    public Medicine() {}

    public String getHeaders(){
        return "Name, Origin, Treatment Category, Price, Numbers of Tablets";
    }

    public String toCSV(){
        return this.getNameOfMedicine() + "," + this.getOrigin() + "," + this.getTreatmentCategory() + "," +
                this.getPriceInUahPerPackage() + "," + this.getNumberOfTabletsInPackage();
    }

    public String getNameOfMedicine() {
        return nameOfMedicine;
    }

    public void setNameOfMedicine(String nameOfMedicine) {
        this.nameOfMedicine = nameOfMedicine;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public TreatmentCategory getTreatmentCategory() {
        return treatmentCategory;
    }

    public void setTreatmentCategory(TreatmentCategory treatmentCategory) {
        this.treatmentCategory = treatmentCategory;
    }

    public double getPriceInUahPerPackage() {
        return priceInUahPerPackage;
    }

    public void setPriceInUahPerPackage(double priceInUahPerPackage) {
        this.priceInUahPerPackage = priceInUahPerPackage;
    }

    public Integer getNumberOfTabletsInPackage() {
        return numberOfTabletsInPackage;
    }

    public void setNumberOfTabletsInPackage(Integer numberOfTabletsInPackage) {
        this.numberOfTabletsInPackage = numberOfTabletsInPackage;
    }
}
