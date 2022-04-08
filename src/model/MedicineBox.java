package model;
import lombok.Data;

@Data
public class MedicineBox{
    public enum TreatmentCategory{
        ANTIVIRAL,
        ANALGESICS,
        VITAMINS,
        ANTIBIOTICS
    }

    private String nameOfMedicineBox;
    private String origin;
    private TreatmentCategory treatmentCategory;
    private double priceInUahPerPackage;
    private Integer numberOfPackInBox;

    public MedicineBox(String nameOfMedicineBox, String origin,
                       TreatmentCategory treatmentCategory,
                       double priceInUahPerPackage,
                       Integer numberOfPackInBox){

        this.nameOfMedicineBox = nameOfMedicineBox;
        this.origin = origin;
        this.treatmentCategory = treatmentCategory;
        this.priceInUahPerPackage = priceInUahPerPackage;
        this.numberOfPackInBox = numberOfPackInBox;
    }

    @Override
    public String toString() {
        return
                 nameOfMedicineBox +
                ", origin = " + origin +
                ", treatmentCategory = " + treatmentCategory +
                ", priceInUahPerPackage = " + priceInUahPerPackage +
                ", numberOfPackInBox = " + numberOfPackInBox;
    }
}
