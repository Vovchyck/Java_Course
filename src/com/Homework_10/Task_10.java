package com.Homework_10;

import java.sql.SQLOutput;

public class Task_10 {
    public static void main(String[] args) {
        Teacher Tomaszevski = new Teacher();
        Tomaszevski.surname = "Tomaszewski";
        Tomaszevski.name = "NotVampire";
        Tomaszevski.age = 245;
        Tomaszevski.subject = "Java";
        Tomaszevski.speciality = "feeds on students' fails";

        Student Coach = new Student();
        Coach.surname = "Potato";
        Coach.name = "Coach";
        Coach.age = 18;
        Coach.group = "47c";
        Coach.speciality = "on exam can remember answers, which he didn't even know";

        System.out.println(Tomaszevski.toString());
        System.out.println(Coach.toString());
    }


}
