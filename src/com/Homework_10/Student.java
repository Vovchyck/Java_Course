package com.Homework_10;

public class Student {
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    String surname;
    int age;
    String group;
    String speciality;
}
