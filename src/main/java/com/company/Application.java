package com.company;
import com.company.manager.MedicineBoxWriter;
import com.company.manager.PharmacyManager;
import com.company.model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application {

    public static void main(String[] args) throws IOException {
//        PharmacyManager manager = new PharmacyManager();
//
//
//
//        MedicineBox penichulinBox = new MedicineBox(new DrugsWithoutPrescription("PenichulinBox", "America",
//                TreatmentCategory.ANTIBIOTICS, 69.0, 100));
//        MedicineBox ascorbinkaBox = new MedicineBox(new DrugsWithoutPrescription("AscorbinkaBox", "Germany",
//                TreatmentCategory.VITAMINS, 70.0, 200));
//        MedicineBox grupicutronBox = new MedicineBox(new DrugsWithoutPrescription("GrupicutronBox", "Poland",
//                TreatmentCategory.ANALGESICS, 71.0, 300));
//        MedicineBox amiksunBox = new MedicineBox(new DrugsWithoutPrescription("AmiksunBox", "Poland",
//                TreatmentCategory.ANTIVIRAL, 71.0, 300));
//        MedicineBox novirunBox = new MedicineBox(new PrescriptionDrugs("NovirunBox", "Poland",
//                TreatmentCategory.ANTIVIRAL, 72.0, 400));
//
//        List<MedicineBox> medicineBoxes = new ArrayList<>();
//        medicineBoxes.add(penichulinBox);
//        medicineBoxes.add(ascorbinkaBox);
//        medicineBoxes.add(grupicutronBox);
//        medicineBoxes.add(amiksunBox);
//        medicineBoxes.add(novirunBox);
//
//        medicineBoxes.sort(Comparator.comparing(o -> o.getClass().getName()));
//        MedicineBoxWriter.writeToCSVFile(medicineBoxes);
//


//        (manager.findMedicineByCategory(medicineBoxes, MedicineBox.TreatmentCategory.ANTIBIOTICS)).forEach(System.out::println);
//        System.out.println();

//        List<MedicineBox> medicineBoxesListFoundedByRange = manager.findMedicineInRange(0, 70.1, medicineBoxes);
//        medicineBoxesListFoundedByRange.forEach(System.out::println);
//        System.out.println();

//        (manager.sortByNumberOfPackInBox(medicineBoxes, true)).forEach(System.out::println);
//        System.out.println();

//        List<MedicineBox> medicineBoxesSortedByPriceInUahPerPackage = manager.sortByPriceInUahPerPackage(medicineBoxes,
//                true);
//        medicineBoxesSortedByPriceInUahPerPackage.forEach(System.out::println);

    }
}
