package com.Homework_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println(numbers);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue).sum(); //наче розібрався, та написати таке самому без підказок здається нереальним
        System.out.println("Сума чисел: " + sum);
    }
}
