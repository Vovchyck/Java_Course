package com.Homework_23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> surnames = new ArrayList<>();
        surnames.add("Мельник");
        surnames.add("Шевченко");
        surnames.add("Мельник");
        surnames.add("Шевченко");
        surnames.add("Мельник");
        surnames.add("Шевченко");
        surnames.add("Мельник");
        surnames.add("Шевченко");
        surnames.add("Мельник");
        surnames.add("Шевченко");
        surnames.add("Бондаренко");
        surnames.add("Коваленко");
        surnames.add("Бондаренко");
        surnames.add("Коваленко");
        surnames.add("Бондаренко");
        surnames.add("Коваленко");
        surnames.add("Бондаренко");
        surnames.add("Коваленко");
        surnames.add("Бондаренко");
        surnames.add("Коваленко");

        Map<String, Integer> map = new HashMap<>();
        for (String surname : surnames) {
            if (map.containsKey(surname)) {
                map.put(surname, map.get(surname) + 1);
            } else {
                map.put(surname, 1);
            }
        }

        for (String surname : map.keySet()) {
            System.out.println(surname + ": " + map.get(surname));
        }
    }
}
