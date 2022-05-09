package com.company.manager;

import lombok.AllArgsConstructor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


@AllArgsConstructor
public class TextEditor {

    private String pathToRandomInputOfText;

    private String getTextFromFile() {
        File file = new File(pathToRandomInputOfText);
        String text = null;

        try (Scanner scanner = new Scanner(file)) {
            StringBuilder result = new StringBuilder();
            while (scanner.hasNextLine()) {
                result.append(scanner.nextLine()).append("\n");
            }

            text = result.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return text;
    }

    public String substituteNumbersForCorrespondingLetters(){
        String text = getTextFromFile();
        assert text != null;
        String result = text.replaceAll("(?<!\\S)1(?![^\\s.,?!])", "A")
                .replaceAll("(?<!\\S)2(?![^\\s.,?!])", "B")
                .replaceAll("(?<!\\S)3(?![^\\s.,?!])", "C")
                .replaceAll("(?<!\\S)4(?![^\\s.,?!])", "D")
                .replaceAll("(?<!\\S)5(?![^\\s.,?!])", "E")
                .replaceAll("(?<!\\S)6(?![^\\s.,?!])", "F")
                .replaceAll("(?<!\\S)7(?![^\\s.,?!])", "G")
                .replaceAll("(?<!\\S)8(?![^\\s.,?!])", "H")
                .replaceAll("(?<!\\S)9(?![^\\s.,?!])", "I");
        System.out.println(result);
        return result;
    }
}

