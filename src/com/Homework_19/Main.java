package com.Homework_19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 51);
        }
        Set<Integer> list1 = new HashSet<>();
        Set<Integer> list2 = new LinkedHashSet<>(); //Зберігає порядок додавання до колекції
        Set<Integer> list3 = new TreeSet<>();


        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);
            list2.add(arr[i]);
            list3.add(arr[i]);
        }
        System.out.println(list1 + "\n" + list2 + "\n" + list3);
    }
}
