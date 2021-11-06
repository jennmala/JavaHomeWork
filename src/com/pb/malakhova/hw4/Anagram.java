package com.pb.malakhova.hw4;

import java.util.Scanner;

public class Anagram {

    static char[] sorting(char[] array) {
        for (int i = array.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (array[j] > array[j + 1])
                {
                    char tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String sentence1 = in.nextLine();
        String sentence2 = in.nextLine();

        char[] charArray1 = sentence1.replaceAll("\\pP", "").replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] charArray2 = sentence2.replaceAll("\\pP", "").replaceAll("\\s", "").toLowerCase().toCharArray();

        charArray1 = sorting(charArray1);
        charArray2 = sorting(charArray2);

        String charRes1 = String.valueOf(charArray1);
        String charRes2 = String.valueOf(charArray2);

        System.out.println(charRes1);
        System.out.println(charRes2);

        System.out.println(charRes1.equalsIgnoreCase(charRes2));
        }
    }

// Arrays.sort(charRes1);
// Arrays.sort(charRes2);
// Arrays.equals(charRes1, charRes2);
