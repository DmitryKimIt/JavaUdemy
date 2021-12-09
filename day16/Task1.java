package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("./src/main/java/day16/read.txt");
        printResult(file);
    }

    public static void printResult(File file) {
        int sumNumbersInt = 0;
        double averegeFull;
        double tmpLenght = 0;
        Scanner scanner = new Scanner("");
        try {
            scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersStr = line.split(" ");
            for (int i = 0; i < numbersStr.length; i++) {
                tmpLenght++;
                try {
                    sumNumbersInt += Integer.parseInt(numbersStr[i]);
                } catch (NumberFormatException e) {
                    tmpLenght--; // сделано для того чтобы независимо от того что попалась неправильный формат
                    // остальные цифры были учтены и посчиталась средняя, а не вылетала программа
                    System.out.println("Числовой формат не найден");
                }
            }
            averegeFull = sumNumbersInt / tmpLenght;
            System.out.printf("%f --> %.3f", averegeFull, averegeFull);
        } catch (FileNotFoundException d) {
            System.out.println("файл не найден");
        }
        scanner.close();
    }
}

