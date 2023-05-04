package com.Homework_34;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 10; i++) {
            Future<Integer> future = executorService.submit(new NumberGenerator());
            try {
                int randomNumber = future.get();
                System.out.println("Число: " + i + ": " + randomNumber);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        executorService.shutdown();
    }
}
