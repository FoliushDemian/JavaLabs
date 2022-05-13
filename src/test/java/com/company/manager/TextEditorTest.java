package com.company.manager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TextEditorTest {

    @Test
    void testSubstituteNumbersForCorrespondingLetters() {
        TextEditor text = new TextEditor("src/main/resources/randomInputOfText.txt");

        StringBuilder sb = new StringBuilder("B, BCDEFB B HGF B,BCD G F B.\n");
        sb.append("C BCDEFB C. HGF C G F C.\n");
        sb.append("D BCDEFB D HGF D G F D.\n");
        sb.append("E BCDEFB E HGF E G F E.\n");
        sb.append("F BCDEFB F HGF F G F F.\n");
        sb.append("G BCDEFB G HGF G G F G.\n");
        sb.append("H BCDEFB H HGF H G F H.\n");
        sb.append("I, BCDEFB. I HGF I I, I, I. I,I F I?\n");
        sb.append("J BCDEFB J HGF J G F J!\n");
        String expectedOutputOfResult = sb.toString();

        String actualOutputOfResult = text.substituteNumbersForCorrespondingLetters();
        assertEquals(expectedOutputOfResult, actualOutputOfResult);
    }
}








