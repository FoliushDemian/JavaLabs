package com.company.manager;

public class Main {
    public static void main(String[] args) {
        TextEditor someText = new TextEditor("src/main/resources/randomInputOfText.txt");
        someText.substituteNumbersForCorrespondingLetters();


    }
}
