package com.pb.malakhova.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Введите 10 целых числел, после каждого числа нажимайте ENTER:");

        int[] array = new int[10];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Вы ввели массив чисел: " + Arrays.toString(array));

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма числел равна: " + sum);

        int numOfPos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) {
                continue;
            }

            if (array[i] > 0) {
                numOfPos++;
            }
        }
        System.out.println("Положительных чисел: " + numOfPos);

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
