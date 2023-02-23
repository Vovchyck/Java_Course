package com.Homework_12;

public class Child extends Parent {
    static {
        System.out.println("2");
    }

    {
        System.out.println("4");
    }
}
