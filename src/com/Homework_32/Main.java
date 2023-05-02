package com.Homework_32;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Counter("Thread 1"));
        Thread thread2 = new Thread(new Counter("Thread 2"));
        thread1.start();
        thread2.start();
    }
}

class Counter implements Runnable {
    private final String threadName;

    public Counter(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName + ":" + i);
        }
    }
}
