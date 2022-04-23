package com.company.manager;

import com.company.model.Medicine;
import com.company.model.MedicineBox;
import com.company.model.TreatmentCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class PharmacyManagerTest {
    List<MedicineBox> medicineBoxes = new ArrayList<>(Arrays.asList(
            new MedicineBox(new Medicine("PenichulinBox", "America",
                    TreatmentCategory.ANTIBIOTICS, 69.0, 100)),
            new MedicineBox(new Medicine("AscorbinkaBox", "Germany",
                    TreatmentCategory.VITAMINS, 70.0, 200)),
            new MedicineBox(new Medicine("GrupicutronBox", "Poland",
                    TreatmentCategory.ANALGESICS, 71.0, 300)),
            new MedicineBox(new Medicine("AmiksunBox", "Poland",
                    TreatmentCategory.ANTIVIRAL, 71.0, 300)),
            new MedicineBox(new Medicine("NovirunBox", "Poland",
                    TreatmentCategory.ANTIVIRAL, 72.0, 400))
    ));


    @Test
    void testSortByNumberOfTabletsInPackageDesc(){

        PharmacyManager manager = new PharmacyManager();
        List<MedicineBox> actualMedicineBoxSortedByNumberOfTabletsInPackage = manager.sortByNumberOfTabletsInPackage(
                                                                medicineBoxes, true);

        Assertions.assertEquals(5, actualMedicineBoxSortedByNumberOfTabletsInPackage.size());

        Assertions.assertEquals(400, actualMedicineBoxSortedByNumberOfTabletsInPackage.get(0)
                .getMedicine().getNumberOfTabletsInPackage());
        Assertions.assertEquals("NovirunBox", actualMedicineBoxSortedByNumberOfTabletsInPackage.get(0)
                .getMedicine().getNameOfMedicine());

        Assertions.assertEquals(300, actualMedicineBoxSortedByNumberOfTabletsInPackage.get(1)
                .getMedicine().getNumberOfTabletsInPackage());
        Assertions.assertEquals("AmiksunBox", actualMedicineBoxSortedByNumberOfTabletsInPackage.get(1)
                .getMedicine().getNameOfMedicine());

        Assertions.assertEquals(300, actualMedicineBoxSortedByNumberOfTabletsInPackage.get(2)
                .getMedicine().getNumberOfTabletsInPackage());
        Assertions.assertEquals("GrupicutronBox", actualMedicineBoxSortedByNumberOfTabletsInPackage.get(2)
                .getMedicine().getNameOfMedicine());

        Assertions.assertEquals(200, actualMedicineBoxSortedByNumberOfTabletsInPackage.get(3)
                .getMedicine().getNumberOfTabletsInPackage());
        Assertions.assertEquals("AscorbinkaBox", actualMedicineBoxSortedByNumberOfTabletsInPackage.get(3)
                .getMedicine().getNameOfMedicine());

        Assertions.assertEquals(100, actualMedicineBoxSortedByNumberOfTabletsInPackage.get(4)
                .getMedicine().getNumberOfTabletsInPackage());
        Assertions.assertEquals("PenichulinBox", actualMedicineBoxSortedByNumberOfTabletsInPackage.get(4)
                .getMedicine().getNameOfMedicine());
    }

    @Test
    void testSortByNumberOfTabletsInPackageAsc(){
        PharmacyManager manager = new PharmacyManager();
        List<MedicineBox> actualMedicineBoxSortedByNumberOfTabletsInPackage = manager.sortByNumberOfTabletsInPackage(
                medicineBoxes, false);

        Assertions.assertEquals(5, actualMedicineBoxSortedByNumberOfTabletsInPackage.size());

        Assertions.assertEquals(100, actualMedicineBoxSortedByNumberOfTabletsInPackage.get(0)
                .getMedicine().getNumberOfTabletsInPackage());
        Assertions.assertEquals("PenichulinBox", actualMedicineBoxSortedByNumberOfTabletsInPackage.get(0)
                .getMedicine().getNameOfMedicine());

        Assertions.assertEquals(200, actualMedicineBoxSortedByNumberOfTabletsInPackage.get(1)
                .getMedicine().getNumberOfTabletsInPackage());
        Assertions.assertEquals("AscorbinkaBox", actualMedicineBoxSortedByNumberOfTabletsInPackage.get(1)
                .getMedicine().getNameOfMedicine());

        Assertions.assertEquals(300, actualMedicineBoxSortedByNumberOfTabletsInPackage.get(2)
                .getMedicine().getNumberOfTabletsInPackage());
        Assertions.assertEquals("GrupicutronBox", actualMedicineBoxSortedByNumberOfTabletsInPackage.get(2)
                .getMedicine().getNameOfMedicine());

        Assertions.assertEquals(300, actualMedicineBoxSortedByNumberOfTabletsInPackage.get(3)
                .getMedicine().getNumberOfTabletsInPackage());
        Assertions.assertEquals("AmiksunBox", actualMedicineBoxSortedByNumberOfTabletsInPackage.get(3)
                .getMedicine().getNameOfMedicine());

        Assertions.assertEquals(400, actualMedicineBoxSortedByNumberOfTabletsInPackage.get(4)
                .getMedicine().getNumberOfTabletsInPackage());
        Assertions.assertEquals("NovirunBox", actualMedicineBoxSortedByNumberOfTabletsInPackage.get(4)
                .getMedicine().getNameOfMedicine());
    }

//    SECOND WAY
//
//    @Test
//    public void testSortByNumberOfTabletsInPackageAsc(){
//
//        PharmacyManager manager = new PharmacyManager();
//        List<MedicineBox> actualMedicineBoxSortedByNumberOfTabletsInPackage = manager.sortByNumberOfTabletsInPackage(
//                medicineBoxes, false);
//        List<MedicineBox> expectedMedicineBoxSortedByNumberOfTabletsInPackage = new ArrayList<>(Arrays.asList(
//                new MedicineBox(new DrugsWithoutPrescription("PenichulinBox", "America",
//                TreatmentCategory.ANTIBIOTICS, 69.0, 100)),
//                new MedicineBox(new DrugsWithoutPrescription("AscorbinkaBox", "Germany",
//                TreatmentCategory.VITAMINS, 70.0, 200)),
//                new MedicineBox(new DrugsWithoutPrescription("GrupicutronBox", "Poland",
//                TreatmentCategory.ANALGESICS, 71.0, 300)),
//                new MedicineBox(new DrugsWithoutPrescription("AmiksunBox", "Poland",
//                TreatmentCategory.ANTIVIRAL, 71.0, 300)),
//                new MedicineBox(new DrugsWithoutPrescription("NovirunBox", "Poland",
//                TreatmentCategory.ANTIVIRAL, 72.0, 400))
//        ));
//        assertThat(actualMedicineBoxSortedByNumberOfTabletsInPackage, is(expectedMedicineBoxSortedByNumberOfTabletsInPackage));
//    }



    @Test
    void testSortByPricePerPackageDesc(){

        PharmacyManager manager = new PharmacyManager();
        List<MedicineBox> actualMedicineBoxSortedByPricePerPackage = manager.sortByPriceInUahPerPackage(
                medicineBoxes, true);
        Assertions.assertEquals(5, actualMedicineBoxSortedByPricePerPackage.size());

        Assertions.assertEquals(72, actualMedicineBoxSortedByPricePerPackage.get(0)
                .getMedicine().getPriceInUahPerPackage());
        Assertions.assertEquals("NovirunBox", actualMedicineBoxSortedByPricePerPackage.get(0)
                .getMedicine().getNameOfMedicine());

        Assertions.assertEquals(71, actualMedicineBoxSortedByPricePerPackage.get(1)
                .getMedicine().getPriceInUahPerPackage());
        Assertions.assertEquals("AmiksunBox", actualMedicineBoxSortedByPricePerPackage.get(1)
                .getMedicine().getNameOfMedicine());

        Assertions.assertEquals(71, actualMedicineBoxSortedByPricePerPackage.get(2)
                .getMedicine().getPriceInUahPerPackage());
        Assertions.assertEquals("GrupicutronBox", actualMedicineBoxSortedByPricePerPackage.get(2)
                .getMedicine().getNameOfMedicine());

        Assertions.assertEquals(70, actualMedicineBoxSortedByPricePerPackage.get(3)
                .getMedicine().getPriceInUahPerPackage());
        Assertions.assertEquals("AscorbinkaBox", actualMedicineBoxSortedByPricePerPackage.get(3)
                .getMedicine().getNameOfMedicine());

        Assertions.assertEquals(69, actualMedicineBoxSortedByPricePerPackage.get(4)
                .getMedicine().getPriceInUahPerPackage());
        Assertions.assertEquals("PenichulinBox", actualMedicineBoxSortedByPricePerPackage.get(4)
                .getMedicine().getNameOfMedicine());
    }

    @Test
    void testSortByPricePerPackageAsc() {

        PharmacyManager manager = new PharmacyManager();
        List<MedicineBox> actualMedicineBoxSortedByPricePerPackage = manager.sortByPriceInUahPerPackage(
                medicineBoxes, false);
        Assertions.assertEquals(5, actualMedicineBoxSortedByPricePerPackage.size());

        Assertions.assertEquals(69, actualMedicineBoxSortedByPricePerPackage.get(0)
                .getMedicine().getPriceInUahPerPackage());
        Assertions.assertEquals("PenichulinBox", actualMedicineBoxSortedByPricePerPackage.get(0)
                .getMedicine().getNameOfMedicine());

        Assertions.assertEquals(70, actualMedicineBoxSortedByPricePerPackage.get(1)
                .getMedicine().getPriceInUahPerPackage());
        Assertions.assertEquals("AscorbinkaBox", actualMedicineBoxSortedByPricePerPackage.get(1)
                .getMedicine().getNameOfMedicine());

        Assertions.assertEquals(71, actualMedicineBoxSortedByPricePerPackage.get(2)
                .getMedicine().getPriceInUahPerPackage());
        Assertions.assertEquals("GrupicutronBox", actualMedicineBoxSortedByPricePerPackage.get(2)
                .getMedicine().getNameOfMedicine());

        Assertions.assertEquals(71, actualMedicineBoxSortedByPricePerPackage.get(3)
                .getMedicine().getPriceInUahPerPackage());
        Assertions.assertEquals("AmiksunBox", actualMedicineBoxSortedByPricePerPackage.get(3)
                .getMedicine().getNameOfMedicine());

        Assertions.assertEquals(72, actualMedicineBoxSortedByPricePerPackage.get(4)
                .getMedicine().getPriceInUahPerPackage());
        Assertions.assertEquals("NovirunBox", actualMedicineBoxSortedByPricePerPackage.get(4)
                .getMedicine().getNameOfMedicine());
    }

    @Test
    void testFindMedicineBoxByCategory(){
        PharmacyManager manager = new PharmacyManager();
        var actualMedicineBox = manager.findMedicineByCategory(medicineBoxes,
                                                    TreatmentCategory.ANTIVIRAL);
        Assertions.assertEquals(2, actualMedicineBox.size());
        Assertions.assertEquals("AmiksunBox", actualMedicineBox.get(0).getMedicine().getNameOfMedicine());
        Assertions.assertEquals("NovirunBox", actualMedicineBox.get(1).getMedicine().getNameOfMedicine());
    }

    @Test
    void testFindMedicineBoxesFoundedByRange(){
        PharmacyManager manager = new PharmacyManager();
        var actualMedicineBox = manager.findMedicineInRange(0,70, medicineBoxes);
        Assertions.assertEquals(2, actualMedicineBox.size());
        Assertions.assertEquals("PenichulinBox", actualMedicineBox.get(0).getMedicine().getNameOfMedicine());
        Assertions.assertEquals("AscorbinkaBox", actualMedicineBox.get(1).getMedicine().getNameOfMedicine());
    }
}