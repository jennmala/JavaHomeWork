package com.pb.malakhova.hw3;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(101);

        System.out.println("Угадайте число от 0 до 100");
        System.out.println("Для выхода из игры введите -1000.");
        Scanner in = new Scanner(System.in);

        for (int counter = 1; ; counter++) {
            int enteredNum = in.nextInt();

            if (enteredNum == -1000) {
                break;
            }

            if (enteredNum < x) {
                System.out.println("Задуманное число больше " + enteredNum);
                continue;
            }

            if (enteredNum > x) {
                System.out.println("Задуманное число меньше " + enteredNum);
                continue;
            }

            if (enteredNum == x) {
                System.out.println("Поздравляем! Вы угадали число с " + counter + " попытки!");
                break;
            }
        }
        System.out.println("Игра окончена.");
    }
}
