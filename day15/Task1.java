package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileRead = new File("src/main/resources/shoes.csv");
        findShoesEmptyPosition(fileRead);
    }

    public static void findShoesEmptyPosition(File fileRead) {
        //List<String> array = new ArrayList<>();
        String[] shoesStr = new String[3];
        int tempLine = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(fileRead);
            PrintWriter writeFileLine = new PrintWriter(new File("src/main/resources/missing_shoes.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                shoesStr = line.split(";");
                try {
                    tempLine = Integer.parseInt(shoesStr[2]);
                    if (tempLine == 0) {
                        writeFileLine.println(line);
                    }
                    //System.out.println(Arrays.toString(shoesStr));
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Ошибка: Некорректная строка в файле или файл пуст");
                }
            }
            scanner.close();
            writeFileLine.close();
        } catch (FileNotFoundException x) {
            System.out.println("Файл не найден");
        }
    }
}
