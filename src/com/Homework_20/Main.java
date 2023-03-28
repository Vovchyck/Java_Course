package com.Homework_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("s5", 5));
        students.add(new Student("s1", 1));
        students.add(new Student("s3", 3));
        students.add(new Student("s2", 2));
        students.add(new Student("s4", 4));

        for (Student student : students) {
            System.out.println(student.getSurname() + " " + student.getAverageMark());
        }
        System.out.println();
        Collections.sort(students, new Increasing());

        for (Student student : students) {
            System.out.println(student.getSurname() + " " + student.getAverageMark());
        }
        System.out.println();

        Collections.sort(students, new Decreasing());
        for (Student student : students) {
            System.out.println(student.getSurname() + " " + student.getAverageMark());
        }
    }
}
