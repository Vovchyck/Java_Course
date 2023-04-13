package com.Homework_25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int number = 0;

        while (number == 0) {
            try {
                number = scanner.nextInt();
            } catch (Exception e) {
                System.err.println("Помилка! Введіть ціле число!");
                scanner.nextLine();
            }
        }
        System.out.println("Введене число: " + number);
    }
}
