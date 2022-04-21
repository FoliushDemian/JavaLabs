package com.company.manager;
import com.company.model.MedicineBox;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class PharmacyManager {

     public List<MedicineBox> findMedicineByCategory(List<MedicineBox> medicineBoxes, MedicineBox.TreatmentCategory category) {
          return medicineBoxes
                  .stream()
                  .filter(medicineBox -> medicineBox.getTreatmentCategory() == category)
                  .collect(Collectors.toList());

     }

     public List<MedicineBox> findMedicineInRange(double lowRange, double highRange, List<MedicineBox> medicineBoxes) {
          return medicineBoxes
                  .stream()
                  .filter(medicineBox -> (medicineBox.getPriceInUahPerPackage() >= lowRange &&
                          medicineBox.getPriceInUahPerPackage() <= highRange))
                  .collect(Collectors.toList());
     }

     public List<MedicineBox> sortByNumberOfPackInBox(List<MedicineBox> medicineBoxes, boolean descendingSort) {
          if(descendingSort){ // дорівнює true
               return medicineBoxes
                       .stream()
                       .sorted(Comparator.comparing(MedicineBox::getNumberOfPackInBox).reversed())
                       .collect(Collectors.toList());
          }
          return medicineBoxes
                  .stream()
                  .sorted(Comparator.comparing(MedicineBox::getNumberOfPackInBox))
                  .collect(Collectors.toList());

     }

     public List<MedicineBox> sortByPriceInUahPerPackage(List<MedicineBox> medicineBoxes, boolean descendingSort){
          if(descendingSort){ // дорівнює true
               return medicineBoxes
                       .stream()
                       .sorted(Comparator.comparing(MedicineBox::getPriceInUahPerPackage).reversed())
                       .collect(Collectors.toList());
          }
          return medicineBoxes
                  .stream()
                  .sorted(Comparator.comparing(MedicineBox::getPriceInUahPerPackage))
                  .collect(Collectors.toList());
     }
}
