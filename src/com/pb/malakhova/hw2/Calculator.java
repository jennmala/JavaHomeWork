package com.pb.malakhova.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        String sign;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первый операнд");
        operand1 = in.nextInt();
        System.out.println("Введите второй операнд");
        operand2 = in.nextInt();
        System.out.println("Введите тип арифметической операции");
        sign = in.next();

        switch (sign) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Нельзя делить на 0");
                } else {
                    System.out.println((operand1 / operand2) + " | остаток от деления = " + (operand1 % operand2));
                }
                break;
            default:
                System.out.println("Неизвестная арифметическая операция");
        }
    }
}
