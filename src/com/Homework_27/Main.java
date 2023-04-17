package com.Homework_27;

import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //          !!!
        //важко. Нічого свого не придумав, тож стибздив в̶а̶ш̶ наш код :D
        //          !!!

        try (InputStream is = new FileInputStream("src/com/Homework_27/Text.txt")) {
            byte[] data = is.readAllBytes();
            String dataString = new String(data);
            System.out.println("Поточний текст:" + "\n" + dataString);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть строку, що замінить поточний текст:");
            String newData = scanner.nextLine();
            try (OutputStream os = new FileOutputStream("src/com/Homework_27/Text.txt")) {
                os.write(newData.getBytes());
                System.out.println("File successfully updated.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
