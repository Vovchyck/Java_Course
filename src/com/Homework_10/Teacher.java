package com.Homework_10;

public class Teacher {
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    String name;
    String surname;
    int age;
    String subject;
    String speciality;
}
