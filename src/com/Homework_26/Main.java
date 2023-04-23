package com.Homework_26;

public class Main {
    public static void main(String[] args) {
        int a = 9;
        if(square(a)<0){
            try {
                System.out.print(square(a));
            } catch (RuntimeException e) {
                System.err.println("Квадрат числа не може бути від'ємним");
                throw new RuntimeException();
            }
        } else {
            System.out.print(square(a));
        }
    }
    public static int square(int a) throws IllegalArgumentException {
        int result = a * a;
        if (result < 0) {
            throw new IllegalArgumentException();
        }
        return result;
    }
}