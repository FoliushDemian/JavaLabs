package com.company.model;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Medicine {
    private String nameOfMedicine;
    private String origin;
    private TreatmentCategory treatmentCategory;
    private double priceInUahPerPackage;
    private Integer numberOfTabletsInPackage;

    public String getHeaders(){
        return "Name, Origin, Treatment Category, Price, Numbers of Tablets";
    }

    public String toCSV(){
        return this.getNameOfMedicine() + "," + this.getOrigin() + "," + this.getTreatmentCategory() + "," +
                this.getPriceInUahPerPackage() + "," + this.getNumberOfTabletsInPackage();
    }
}
