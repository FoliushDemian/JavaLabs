package com.company.manager;

import com.company.model.MedicineBox;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class PharmacyManagerTest {
    List<MedicineBox> medicineBoxes = new ArrayList<>(Arrays.asList(
            new MedicineBox("PenichulinBox", "America",
                    MedicineBox.TreatmentCategory.ANTIBIOTICS, 69.0, 100),
            new MedicineBox("AscorbinkaBox", "Germany",
                    MedicineBox.TreatmentCategory.VITAMINS, 70.0, 200),
            new MedicineBox("GrupicutronBox", "Poland",
                    MedicineBox.TreatmentCategory.ANALGESICS, 71.0, 300),
            new MedicineBox("AmiksunBox", "Poland",
                    MedicineBox.TreatmentCategory.ANTIVIRAL, 71.0, 300),
            new MedicineBox("NovirunBox", "Poland",
                    MedicineBox.TreatmentCategory.ANTIVIRAL, 72.0, 400)
    ));

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @Test
    void testSortByNumberOfPackInBoxDesc(){

        PharmacyManager manager = new PharmacyManager();
        List<MedicineBox> actualMedicineBoxSortedByPackInBox = manager.sortByNumberOfPackInBox(
                                                                medicineBoxes, true);
        Assertions.assertEquals(5, actualMedicineBoxSortedByPackInBox.size());

        Assertions.assertEquals(400, actualMedicineBoxSortedByPackInBox.get(0).getNumberOfPackInBox());
        Assertions.assertEquals("NovirunBox", actualMedicineBoxSortedByPackInBox.get(0).getNameOfMedicineBox());

        Assertions.assertEquals(300, actualMedicineBoxSortedByPackInBox.get(1).getNumberOfPackInBox());
        Assertions.assertEquals("GrupicutronBox", actualMedicineBoxSortedByPackInBox.get(1).getNameOfMedicineBox());

        Assertions.assertEquals(300, actualMedicineBoxSortedByPackInBox.get(2).getNumberOfPackInBox());
        Assertions.assertEquals("AmiksunBox", actualMedicineBoxSortedByPackInBox.get(2).getNameOfMedicineBox());

        Assertions.assertEquals(200, actualMedicineBoxSortedByPackInBox.get(3).getNumberOfPackInBox());
        Assertions.assertEquals("AscorbinkaBox", actualMedicineBoxSortedByPackInBox.get(3).getNameOfMedicineBox());

        Assertions.assertEquals(100, actualMedicineBoxSortedByPackInBox.get(4).getNumberOfPackInBox());
        Assertions.assertEquals("PenichulinBox", actualMedicineBoxSortedByPackInBox.get(4).getNameOfMedicineBox());
    }

    @Test
    void testSortByNumberOfPackInBoxAsc(){
        PharmacyManager manager = new PharmacyManager();
        List<MedicineBox> actualMedicineBoxSortedByPackInBox = manager.sortByNumberOfPackInBox(
                medicineBoxes, false);
        Assertions.assertEquals(5, actualMedicineBoxSortedByPackInBox.size());

        Assertions.assertEquals(100, actualMedicineBoxSortedByPackInBox.get(0).getNumberOfPackInBox());
        Assertions.assertEquals("PenichulinBox", actualMedicineBoxSortedByPackInBox.get(0).getNameOfMedicineBox());

        Assertions.assertEquals(200, actualMedicineBoxSortedByPackInBox.get(1).getNumberOfPackInBox());
        Assertions.assertEquals("AscorbinkaBox", actualMedicineBoxSortedByPackInBox.get(1).getNameOfMedicineBox());

        Assertions.assertEquals(300, actualMedicineBoxSortedByPackInBox.get(2).getNumberOfPackInBox());
        Assertions.assertEquals("GrupicutronBox", actualMedicineBoxSortedByPackInBox.get(2).getNameOfMedicineBox());

        Assertions.assertEquals(300, actualMedicineBoxSortedByPackInBox.get(3).getNumberOfPackInBox());
        Assertions.assertEquals("AmiksunBox", actualMedicineBoxSortedByPackInBox.get(3).getNameOfMedicineBox());

        Assertions.assertEquals(400, actualMedicineBoxSortedByPackInBox.get(4).getNumberOfPackInBox());
        Assertions.assertEquals("NovirunBox", actualMedicineBoxSortedByPackInBox.get(4).getNameOfMedicineBox());
    }

    @Test
    void testSortByPricePerPackageDesc(){

        PharmacyManager manager = new PharmacyManager();
        List<MedicineBox> actualMedicineBoxSortedByPricePerPackage = manager.sortByPriceInUahPerPackage(
                medicineBoxes, true);
        Assertions.assertEquals(5, actualMedicineBoxSortedByPricePerPackage.size());

        Assertions.assertEquals(72, actualMedicineBoxSortedByPricePerPackage.get(0).getPriceInUahPerPackage());
        Assertions.assertEquals("NovirunBox", actualMedicineBoxSortedByPricePerPackage.get(0).getNameOfMedicineBox());

        Assertions.assertEquals(71, actualMedicineBoxSortedByPricePerPackage.get(1).getPriceInUahPerPackage());
        Assertions.assertEquals("GrupicutronBox", actualMedicineBoxSortedByPricePerPackage.get(1).getNameOfMedicineBox());

        Assertions.assertEquals(71, actualMedicineBoxSortedByPricePerPackage.get(2).getPriceInUahPerPackage());
        Assertions.assertEquals("AmiksunBox", actualMedicineBoxSortedByPricePerPackage.get(2).getNameOfMedicineBox());

        Assertions.assertEquals(70, actualMedicineBoxSortedByPricePerPackage.get(3).getPriceInUahPerPackage());
        Assertions.assertEquals("AscorbinkaBox", actualMedicineBoxSortedByPricePerPackage.get(3).getNameOfMedicineBox());

        Assertions.assertEquals(69, actualMedicineBoxSortedByPricePerPackage.get(4).getPriceInUahPerPackage());
        Assertions.assertEquals("PenichulinBox", actualMedicineBoxSortedByPricePerPackage.get(4).getNameOfMedicineBox());
    }

    @Test
    void testSortByPricePerPackageAsc(){
        PharmacyManager manager = new PharmacyManager();
        List<MedicineBox> actualMedicineBoxSortedByPricePerPackage = manager.sortByPriceInUahPerPackage(
                medicineBoxes, false);
        Assertions.assertEquals(5, actualMedicineBoxSortedByPricePerPackage.size());

        Assertions.assertEquals(69, actualMedicineBoxSortedByPricePerPackage.get(0).getPriceInUahPerPackage());
        Assertions.assertEquals("PenichulinBox", actualMedicineBoxSortedByPricePerPackage.get(0).getNameOfMedicineBox());

        Assertions.assertEquals(70, actualMedicineBoxSortedByPricePerPackage.get(1).getPriceInUahPerPackage());
        Assertions.assertEquals("AscorbinkaBox", actualMedicineBoxSortedByPricePerPackage.get(1).getNameOfMedicineBox());

        Assertions.assertEquals(71, actualMedicineBoxSortedByPricePerPackage.get(2).getPriceInUahPerPackage());
        Assertions.assertEquals("GrupicutronBox", actualMedicineBoxSortedByPricePerPackage.get(2).getNameOfMedicineBox());

        Assertions.assertEquals(71, actualMedicineBoxSortedByPricePerPackage.get(3).getPriceInUahPerPackage());
        Assertions.assertEquals("AmiksunBox", actualMedicineBoxSortedByPricePerPackage.get(3).getNameOfMedicineBox());

        Assertions.assertEquals(72, actualMedicineBoxSortedByPricePerPackage.get(4).getPriceInUahPerPackage());
        Assertions.assertEquals("NovirunBox", actualMedicineBoxSortedByPricePerPackage.get(4).getNameOfMedicineBox());
    }

    @Test
    void testFindMedicineBoxByCategory(){
        PharmacyManager manager = new PharmacyManager();
        var actualMedicineBox = manager.findMedicineByCategory(medicineBoxes,
                                                    MedicineBox.TreatmentCategory.ANTIVIRAL);
        Assertions.assertEquals(2, actualMedicineBox.size());
        Assertions.assertEquals("AmiksunBox", actualMedicineBox.get(0).getNameOfMedicineBox());
        Assertions.assertEquals("NovirunBox", actualMedicineBox.get(1).getNameOfMedicineBox());
    }

    @Test
    void testFindMedicineBoxesFoundedByRange(){
        PharmacyManager manager = new PharmacyManager();
        var actualMedicineBox = manager.findMedicineInRange(0,70, medicineBoxes);
        Assertions.assertEquals(2, actualMedicineBox.size());
        Assertions.assertEquals("PenichulinBox", actualMedicineBox.get(0).getNameOfMedicineBox());
        Assertions.assertEquals("AscorbinkaBox", actualMedicineBox.get(1).getNameOfMedicineBox());
    }
}