package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        File file1 = new File("./src/main/java/day14/people.txt"); //убрал
//        System.out.println(parseFileToStringList(file1));
        System.out.println(parseFileToStringList(new File("./src/main/java/day14/people.txt")));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> array = new ArrayList<>();
        Scanner scanner = new Scanner("");
        try {
            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                array.add(line);
                String[] ageStr = line.split(" "); // объявил массив тут
                if (Integer.parseInt(ageStr[1]) < 0) {
                    throw new IOException();
                }
            }

        } catch (
                FileNotFoundException x) {
            System.out.println("Файл не найден");
        } catch (
                IOException e) {
            System.out.println("Некорректный входной файл");
        }

        return array;
    }

}
