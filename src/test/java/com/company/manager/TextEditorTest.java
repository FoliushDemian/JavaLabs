package com.company.manager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TextEditorTest {

    @Test
    void testSubstituteNumbersForCorrespondingLetters() {
        TextEditor text = new TextEditor("src/main/resources/randomInputOfText.txt");

        StringBuilder sb = new StringBuilder("A 123451 A 765 A F E A.\n");
        sb.append("B 123451 B 765 B F E B.\n");
        sb.append("C 123451 C 765 C F E C.\n");
        sb.append("D 123451 D 765 D F E D.\n");
        sb.append("E 123451 E 765 E F E E.\n");
        sb.append("F 123451 F 765 F F E F.\n");
        sb.append("G 123451 G 765 G F E G,\n");
        sb.append("H 123451 H 765 H F E H?\n");
        sb.append("I 123451 I 765 I F E I!\n");
        String expectedOutputOfResult = sb.toString();

        String actualOutputOfResult = text.substituteNumbersForCorrespondingLetters();
        assertEquals(expectedOutputOfResult, actualOutputOfResult);
    }
}
