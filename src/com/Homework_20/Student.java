package com.Homework_20;

public class Student {
    private String surname;
    private int averageMark;

    public Student(String surname, int averageMark) {
        this.surname = surname;
        this.averageMark = averageMark;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
