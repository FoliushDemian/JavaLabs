package com.company.manager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TextEditorTest {

    @Test
    void testSubstituteNumbersForCorrespondingLetters() {
        TextEditor text = new TextEditor("src/main/resources/randomInputOfText.txt");

        StringBuilder sb = new StringBuilder("A, ABCDEA A GFE A,ABC F E A.Z\n");
        sb.append("B ABCDEA B. GFE B F E B.\n");
        sb.append("C ABCDEA C GFE C F E C.\n");
        sb.append("D ABCDEA D GFE D F E D.\n");
        sb.append("E ABCDEA E GFE E F E E.\n");
        sb.append("F ABCDEA F GFE F F E F.\n");
        sb.append("G ABCDEA G GFE G F E G.\n");
        sb.append("H, ABCDEA. H GFE H H, H, H. H,H E H?\n");
        sb.append("I ABCDEA I GFE I F E I!\n");
        String expectedOutputOfResult = sb.toString();

        String actualOutputOfResult = text.substituteNumbersForCorrespondingLetters();
        assertEquals(expectedOutputOfResult, actualOutputOfResult);
    }
}








