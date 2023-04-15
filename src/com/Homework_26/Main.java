package com.Homework_26;

public class Main {
    public static void main(String[] args) {
        int a = 9;
        if(square(a)<0){
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                System.err.println("Квадрат числа не може бути від'ємним");
            }
        } else {
            System.out.print(square(a));
        }
    }
    public static int square(int a) {
        return a * a;
    }
}
