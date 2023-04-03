package com.Homework_22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String[]> map = new HashMap<>();
        map.put("серветка", new String[]{"napkin", "Serviette", "ナプキン"});
        map.put("хліб", new String[]{"bread", "brot", "パン"});
        map.put("кава", new String[]{"coffee", "Kaffee", "コーヒー"});
        map.put("цукерка", new String[]{"candy", "Candy", "キャンディ"});
        map.put("торт", new String[]{"cake", "Cake", "ケーキ"});
        map.put("кавун", new String[]{"watermelon", "Watermelon", "ウォーターメロン"});
        map.put("чай", new String[]{"tea", "Tea", "テーブル"});
        map.put("салат", new String[]{"salad", "Salad", "サラダ"});
        map.put("піца", new String[]{"pizza", "Pizza", "パイ"});
        map.put("суп", new String[]{"soup", "Soup", "スープ"});

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть слово зі списку: \n'серветка', 'хліб', 'кава', 'цукерка', 'торт', 'кавун', 'чай', 'салат', 'піца', 'суп'. \nВаше слово: ");
        String word = scan.nextLine();

        if(map.containsKey(word)) {
            System.out.println("Ваше слово на англійській, німецькій та японській відповідно: " + map.get(word)[0] + " " + map.get(word)[1] + " " + map.get(word)[2]);
        } else {
            System.out.println("Я для кого таблицю вивів? Читай умову!");
        }
    }
}
