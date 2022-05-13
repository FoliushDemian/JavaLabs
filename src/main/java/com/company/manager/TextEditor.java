package com.company.manager;

import lombok.AllArgsConstructor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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

    public String substituteNumbersForCorrespondingLetters() {
        String text = getTextFromFile();
        assert text != null;
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(text);
        text = matcher.replaceAll((match) -> {
            String noToReplace = match.group();
            int n = Integer.parseInt(noToReplace);
            return letters[n];
        });
        return text;
    }
}
