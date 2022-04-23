package com.company.manager;

import com.company.model.MedicineBox;
import com.company.model.TreatmentCategory;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class PharmacyManager {

     public List<MedicineBox> findMedicineByCategory(List<MedicineBox> medicineBoxes, TreatmentCategory category) {
          return medicineBoxes
                  .stream()
                  .filter(medicineBox -> medicineBox.getMedicine().getTreatmentCategory() == category)
                  .collect(Collectors.toList());

     }

     public List<MedicineBox> findMedicineInRange(double lowRange, double highRange, List<MedicineBox> medicineBoxes) {
          return medicineBoxes
                  .stream()
                  .filter(medicineBox -> (medicineBox.getMedicine().getPriceInUahPerPackage() >= lowRange &&
                          medicineBox.getMedicine().getPriceInUahPerPackage() <= highRange))
                  .collect(Collectors.toList());
     }

     public List<MedicineBox> sortByNumberOfTabletsInPackage(List<MedicineBox> medicineBoxes, boolean descendingSort) {
          List<MedicineBox> sortedMedicineBoxesInAscendingByNumberOfTablets =  medicineBoxes.stream()
                  .sorted(Comparator.comparing(medicineBox -> medicineBox.getMedicine().getNumberOfTabletsInPackage()))
                  .collect(Collectors.toList());

          if(descendingSort){
               Collections.reverse(sortedMedicineBoxesInAscendingByNumberOfTablets);
          }

          return sortedMedicineBoxesInAscendingByNumberOfTablets;
     }


     public List<MedicineBox> sortByPriceInUahPerPackage(List<MedicineBox> medicineBoxes, boolean descendingSort){
          List<MedicineBox> sortedMedicineBoxesInAscendingByPriceInUahPerPackage =  medicineBoxes.stream()
                  .sorted(Comparator.comparing(medicineBox -> medicineBox.getMedicine().getPriceInUahPerPackage()))
                  .collect(Collectors.toList());

          if(descendingSort){
               Collections.reverse(sortedMedicineBoxesInAscendingByPriceInUahPerPackage);
          }

          return sortedMedicineBoxesInAscendingByPriceInUahPerPackage;
     }

}
