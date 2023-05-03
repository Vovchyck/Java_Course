package com.Homework_33;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    int a = new Random().nextInt(1, 10);
                    System.out.print(a + " ");
                    if (a == 5) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });
        thread.start();
    }
}
