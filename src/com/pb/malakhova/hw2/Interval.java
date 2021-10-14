package com.pb.malakhova.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int enteredNumber;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        enteredNumber = in.nextInt();
        if ((0 <= enteredNumber) && (enteredNumber <= 14)) {
            System.out.println("Введенное число находится в промежутке [0 - 14]");
        } else if ((15 <= enteredNumber) && (enteredNumber <= 35)) {
            System.out.println("Введенное число находится в промежутке [15 - 35]");
        } else if ((36 <= enteredNumber) && (enteredNumber <= 50)) {
            System.out.println("Введенное число находится в промежутке [36 - 50]");
        } else if ((51 <= enteredNumber) && (enteredNumber <= 100)) {
            System.out.println("Введенное число находится в промежутке [51 - 100]");
        } else {
            System.out.println("Введенное число меньше 0 или больше 100");
        }
    }
}
