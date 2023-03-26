package com.Homework_20;

import java.util.Comparator;

public class Increasing implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getAverageMark() < s2.getAverageMark()) {
            return -1;
        } else if (s1.getAverageMark() > s2.getAverageMark()) {
            return 1;
        } else {
            return 0;
        }
    }
}
