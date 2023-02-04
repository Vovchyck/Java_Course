package com.Homework_8;

import java.util.Random;

public class Task_8 {
    public static void main(String[] args) {
        int length = 10;
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0,100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(getMin(arr));
        System.out.println(getMax(arr));
        System.out.println(getAvg(arr));
    }
    static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
