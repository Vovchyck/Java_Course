package com.Homework_34;

import java.util.Random;
import java.util.concurrent.Callable;

public class NumberGenerator implements Callable<Integer> {
    public Integer call() throws Exception {
        Random random = new Random();
        return random.nextInt(1,50);
    }
}
