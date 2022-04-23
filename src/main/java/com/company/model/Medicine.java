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
}
