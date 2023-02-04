package com.Homework_7;

public class Task_7 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(getCube(number));
        getSymbol(number);
        getSymbol(number,"#");
    }
    static int getCube(int number) {
        return number * number * number;
    }
    static void getSymbol(int number){
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    static void getSymbol(int number, String symbol){
        for(int i = 0; i < number; i++){
            System.out.print(symbol);
        }
        System.out.println();
    }
}
