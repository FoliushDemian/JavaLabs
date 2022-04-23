package com.company.model;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MedicineBox{
    private Medicine medicine;

//    @Override
//    public String toString() {
//        return
//                 nameOfMedicineBox +
//                ", origin = " + origin +
//                ", treatmentCategory = " + treatmentCategory +
//                ", priceInUahPerPackage = " + priceInUahPerPackage +
//                ", numberOfPackInBox = " + numberOfPackInBox;
//    }
}
