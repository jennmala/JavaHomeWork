package com.pb.malakhova.hw4;

import java.util.Scanner;

public class CapitalLetter {

    static void upFirstLet(String word) {
        String sentenseRes = word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        System.out.print(sentenseRes);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentenceEnt = in.nextLine();
        String[] sentenceParts = sentenceEnt.split(" ");

        for (int i = 0; i < sentenceParts.length; i++) {
            upFirstLet(sentenceParts[i]);
        }
    }
}
