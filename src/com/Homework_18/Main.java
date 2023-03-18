package com.Homework_18;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        List<Integer> ten = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            ten.add(i);
        }
        System.out.println(ten);
        System.out.println(ten.size());

        List<Long> twoMillion = new ArrayList<>();
        for(long i = 0; i < 2000000; i++){
            twoMillion.add(i);
        }
    //    System.out.println(twoMillion);
        System.out.println(twoMillion.size());


        List<Student> students = new ArrayList<>();
        students.add(new Student("James", "Bond", 37, "MI6"));

        //мені не вистачило сил і фантазії аби придумати ще 9 студентів,
        //тож я витратив 4 години аби розібратись як б вони самі створились
        int studentsCount = 9;
        Random rand = new Random();
        for (int i = 0; i < studentsCount; i++) {
            String name = generateRandomString(rand.nextInt(3, 10));
            String surname = generateRandomString(rand.nextInt(3, 10));
            int age = rand.nextInt(14, 30);
            String group = generateRandomGroup(3);
            students.add(new Student(name, surname, age, group));
        }

        for (Student str : students) {
            System.out.println(str.getName() + " " + str.getSurname() + " " + str.getAge() + " " + str.getGroup());
        }
    }
    /* Я захтів поексперементувати з кодом. Сам я таке наврядче напишу, та хвала chatGPT!
    Там далі методи для генерації рандомних імен і тд. В теорії воно і 10 і 2 мільйони студентів створить,
    та перевіряти я не ризикну. Мій ноут взірветься */
    public static String generateRandomString(int length) {
        Random rand = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(alphabet.charAt(rand.nextInt(alphabet.length())));
        }
        String generatedString = sb.toString();
        String firstLetter = generatedString.substring(0, 1).toUpperCase();
        String restOfWord = generatedString.substring(1);
        return firstLetter + restOfWord;
    }
    public static String generateRandomGroup (int length) {
        Random rand = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(alphabet.charAt(rand.nextInt(alphabet.length())));
        }
        String generatedString = sb.toString();
        String firstLetter = generatedString.substring(0, 1).toUpperCase();
        String restOfWord = generatedString.substring(1);
        return firstLetter + restOfWord;
    }
}
