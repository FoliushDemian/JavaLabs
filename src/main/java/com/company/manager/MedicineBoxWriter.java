package com.company.manager;

import com.company.model.MedicineBox;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MedicineBoxWriter {
    public static void writeToCSVFile(List<MedicineBox> medicineBoxes) throws IOException {
        try (FileWriter fileWriter = new FileWriter("result.csv")) {

            String previousClassName = "";

            for (MedicineBox medicineBox: medicineBoxes) {
                if (!medicineBox.getClass().getSimpleName().equals(previousClassName)) {
                    fileWriter.write(medicineBox.getMedicine().getHeaders());
                    fileWriter.write("\r\n");
                    previousClassName = medicineBox.getClass().getSimpleName();
                }
                fileWriter.write(medicineBox.getMedicine().toCSV());
                fileWriter.write("\r\n"); }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
