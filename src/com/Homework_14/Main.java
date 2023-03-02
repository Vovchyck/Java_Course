package com.Homework_14;

public class Main {
    public static void main(String[] args) {
        Human student = new Student();
        Human teacher = new Teacher();
        System.out.println(student.description());
        System.out.println(teacher.description());
    }
}
