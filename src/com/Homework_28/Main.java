package com.Homework_28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = "src/com/Homework_28/Text.txt";
        Path path1 = Paths.get(path);
        try {
            System.out.println("Текст файла: ");
            Files.readAllLines(path1).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        try {
            List<String> lines = Files.readAllLines(path1);
            lines.add(scanner.nextLine());
            Files.write(path1, lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            scanner.close();
        }
    }
}