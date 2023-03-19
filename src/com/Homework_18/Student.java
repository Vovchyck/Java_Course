package com.Homework_18;

public class Student {
    private final String name;
    private final String surname;
    private final int age;
    private final String group;

    public Student(String lastName, String firstName, int age, String group) {
        this.name = lastName;
        this.surname = firstName;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }
}
