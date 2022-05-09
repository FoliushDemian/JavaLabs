package com.company.manager;

import com.company.model.*;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class PharmacyManagerTest {
    List<MedicineBox> medicineBoxes = new ArrayList<>(Arrays.asList(
            new MedicineBox(new DrugsWithoutPrescription("PenichulinBox", "America",
                    TreatmentCategory.ANTIBIOTICS, 69.0, 100)),
            new MedicineBox(new DrugsWithoutPrescription("AscorbinkaBox", "Germany",
                    TreatmentCategory.VITAMINS, 70.0, 200)),
            new MedicineBox(new DrugsWithoutPrescription("GrupicutronBox", "Poland",
                    TreatmentCategory.ANALGESICS, 71.0, 300)),
            new MedicineBox(new DrugsWithoutPrescription("AmiksunBox", "Poland",
                    TreatmentCategory.ANTIVIRAL, 71.0, 300)),
            new MedicineBox(new PrescriptionDrugs("NovirunBox", "Poland",
                    TreatmentCategory.ANTIVIRAL, 72.0, 400))
    ));


    @Test
    void testSortByNumberOfTabletsInPackageDesc(){

        PharmacyManager manager = new PharmacyManager();
        List<MedicineBox> actualMedicineBoxSortedByNumberOfTabletsInPackage = manager.sortByNumberOfTabletsInPackage(
                                                                medicineBoxes, true);

        assertEquals(5, actualMedicineBoxSortedByNumberOfTabletsInPackage.size());

        assertEquals(400, actualMedicineBoxSortedByNumberOfTabletsInPackage.get(0)
                .getMedicine().getNumberOfTabletsInPackage());
        assertEquals("NovirunBox", actualMedicineBoxSortedByNumberOfTabletsInPackage.get(0)
                .getMedicine().getNameOfMedicine());

        assertEquals(300, actualMedicineBoxSortedByNumberOfTabletsInPackage.get(1)
                .getMedicine().getNumberOfTabletsInPackage());
        assertEquals("AmiksunBox", actualMedicineBoxSortedByNumberOfTabletsInPackage.get(1)
                .getMedicine().getNameOfMedicine());

        assertEquals(300, actualMedicineBoxSortedByNumberOfTabletsInPackage.get(2)
                .getMedicine().getNumberOfTabletsInPackage());
        assertEquals("GrupicutronBox", actualMedicineBoxSortedByNumberOfTabletsInPackage.get(2)
                .getMedicine().getNameOfMedicine());

        assertEquals(200, actualMedicineBoxSortedByNumberOfTabletsInPackage.get(3)
                .getMedicine().getNumberOfTabletsInPackage());
        assertEquals("AscorbinkaBox", actualMedicineBoxSortedByNumberOfTabletsInPackage.get(3)
                .getMedicine().getNameOfMedicine());

        assertEquals(100, actualMedicineBoxSortedByNumberOfTabletsInPackage.get(4)
                .getMedicine().getNumberOfTabletsInPackage());
        assertEquals("PenichulinBox", actualMedicineBoxSortedByNumberOfTabletsInPackage.get(4)
                .getMedicine().getNameOfMedicine());
    }

    @Test
    public void testSortByNumberOfTabletsInPackageAsc(){

        PharmacyManager manager = new PharmacyManager();
        List<MedicineBox> actualMedicineBoxSortedByNumberOfTabletsInPackage = manager.sortByNumberOfTabletsInPackage(
                medicineBoxes, false);
        List<MedicineBox> expectedMedicineBoxSortedByNumberOfTabletsInPackage = new ArrayList<>(Arrays.asList(
                new MedicineBox(new DrugsWithoutPrescription("PenichulinBox", "America",
                        TreatmentCategory.ANTIBIOTICS, 69.0, 100)),
                new MedicineBox(new DrugsWithoutPrescription("AscorbinkaBox", "Germany",
                        TreatmentCategory.VITAMINS, 70.0, 200)),
                new MedicineBox(new DrugsWithoutPrescription("GrupicutronBox", "Poland",
                        TreatmentCategory.ANALGESICS, 71.0, 300)),
                new MedicineBox(new DrugsWithoutPrescription("AmiksunBox", "Poland",
                        TreatmentCategory.ANTIVIRAL, 71.0, 300)),
                new MedicineBox(new PrescriptionDrugs("NovirunBox", "Poland",
                        TreatmentCategory.ANTIVIRAL, 72.0, 400))
        ));
        assertThat(actualMedicineBoxSortedByNumberOfTabletsInPackage, is(expectedMedicineBoxSortedByNumberOfTabletsInPackage));
    }

    @Test
    public void equalsAndHashCodeTest() {
        EqualsVerifier.simple().forClass(MedicineBox.class).verify();
    }

    @Test
    void testSortByPricePerPackageDesc(){

        PharmacyManager manager = new PharmacyManager();
        List<MedicineBox> actualMedicineBoxSortedByPricePerPackage = manager.sortByPriceInUahPerPackage(
                medicineBoxes, true);
        assertEquals(5, actualMedicineBoxSortedByPricePerPackage.size());

        assertEquals(72, actualMedicineBoxSortedByPricePerPackage.get(0)
                .getMedicine().getPriceInUahPerPackage());
        assertEquals("NovirunBox", actualMedicineBoxSortedByPricePerPackage.get(0)
                .getMedicine().getNameOfMedicine());

        assertEquals(71, actualMedicineBoxSortedByPricePerPackage.get(1)
                .getMedicine().getPriceInUahPerPackage());
        assertEquals("AmiksunBox", actualMedicineBoxSortedByPricePerPackage.get(1)
                .getMedicine().getNameOfMedicine());

        assertEquals(71, actualMedicineBoxSortedByPricePerPackage.get(2)
                .getMedicine().getPriceInUahPerPackage());
        assertEquals("GrupicutronBox", actualMedicineBoxSortedByPricePerPackage.get(2)
                .getMedicine().getNameOfMedicine());

        assertEquals(70, actualMedicineBoxSortedByPricePerPackage.get(3)
                .getMedicine().getPriceInUahPerPackage());
        assertEquals("AscorbinkaBox", actualMedicineBoxSortedByPricePerPackage.get(3)
                .getMedicine().getNameOfMedicine());

        assertEquals(69, actualMedicineBoxSortedByPricePerPackage.get(4)
                .getMedicine().getPriceInUahPerPackage());
        assertEquals("PenichulinBox", actualMedicineBoxSortedByPricePerPackage.get(4)
                .getMedicine().getNameOfMedicine());
    }

    @Test
    void testSortByPricePerPackageAsc() {

        PharmacyManager manager = new PharmacyManager();
        List<MedicineBox> actualMedicineBoxSortedByPricePerPackage = manager.sortByPriceInUahPerPackage(
                medicineBoxes, false);
        assertEquals(5, actualMedicineBoxSortedByPricePerPackage.size());

        assertEquals(69, actualMedicineBoxSortedByPricePerPackage.get(0)
                .getMedicine().getPriceInUahPerPackage());
        assertEquals("PenichulinBox", actualMedicineBoxSortedByPricePerPackage.get(0)
                .getMedicine().getNameOfMedicine());

        assertEquals(70, actualMedicineBoxSortedByPricePerPackage.get(1)
                .getMedicine().getPriceInUahPerPackage());
        assertEquals("AscorbinkaBox", actualMedicineBoxSortedByPricePerPackage.get(1)
                .getMedicine().getNameOfMedicine());

        assertEquals(71, actualMedicineBoxSortedByPricePerPackage.get(2)
                .getMedicine().getPriceInUahPerPackage());
        assertEquals("GrupicutronBox", actualMedicineBoxSortedByPricePerPackage.get(2)
                .getMedicine().getNameOfMedicine());

        assertEquals(71, actualMedicineBoxSortedByPricePerPackage.get(3)
                .getMedicine().getPriceInUahPerPackage());
        assertEquals("AmiksunBox", actualMedicineBoxSortedByPricePerPackage.get(3)
                .getMedicine().getNameOfMedicine());

        assertEquals(72, actualMedicineBoxSortedByPricePerPackage.get(4)
                .getMedicine().getPriceInUahPerPackage());
        assertEquals("NovirunBox", actualMedicineBoxSortedByPricePerPackage.get(4)
                .getMedicine().getNameOfMedicine());
    }

    @Test
    void testFindMedicineBoxByCategory(){
        PharmacyManager manager = new PharmacyManager();
        var actualMedicineBox = manager.findMedicineByCategory(medicineBoxes,
                                                    TreatmentCategory.ANTIVIRAL);
        assertEquals(2, actualMedicineBox.size());
        assertEquals("AmiksunBox", actualMedicineBox.get(0).getMedicine().getNameOfMedicine());
        assertEquals("NovirunBox", actualMedicineBox.get(1).getMedicine().getNameOfMedicine());
    }

    @Test
    void testFindMedicineBoxesFoundedByRange(){
        PharmacyManager manager = new PharmacyManager();
        var actualMedicineBox = manager.findMedicineInRange(0,70, medicineBoxes);
        assertEquals(2, actualMedicineBox.size());
        assertEquals("PenichulinBox", actualMedicineBox.get(0).getMedicine().getNameOfMedicine());
        assertEquals("AscorbinkaBox", actualMedicineBox.get(1).getMedicine().getNameOfMedicine());
    }

    @Test
    public void testWriteToCSVFileMethod () {
        try (FileReader expectedFileReader = new FileReader(
                "expectedResult.csv");
             BufferedReader expectedBufferedReader = new BufferedReader(expectedFileReader);
             FileReader actualFileReader = new FileReader(
                     "result.csv");
             BufferedReader actualBufferedReader = new BufferedReader(actualFileReader)) {

            MedicineBoxWriter.writeToCSVFile(medicineBoxes);

            String line1 = expectedBufferedReader.readLine();
            String line2 = actualBufferedReader.readLine();
            boolean areTwoLinesEqual = true;
            int numberOfLine = 1;

            while (line1 != null || line2 != null) {
                if(line1 == null || line2 == null) {
                    areTwoLinesEqual = false;
                    break;
                }
                else if(!line1.equalsIgnoreCase(line2)) {
                    areTwoLinesEqual = false;
                    break;
                }

                line1 = expectedBufferedReader.readLine();
                line2 = actualBufferedReader.readLine();
                numberOfLine++;
            }

            if(areTwoLinesEqual) {
                assertEquals(expectedBufferedReader.readLine(), actualBufferedReader.readLine());
            } else {
                fail("Two files have different content. They differ at line " + numberOfLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

