package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileRead = new File("src/main/resources/shoes.csv");
        findShoesEmptyPosition(fileRead);
    }

    public static void findShoesEmptyPosition(File fileRead) {
        //List<String> array = new ArrayList<>();
        int tempLine = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(fileRead);
            PrintWriter writeFileLine = new PrintWriter(new File("src/main/resources/missing_shoes.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoesStr = line.split(";"); // исправлено

                tempLine = Integer.parseInt(shoesStr[2]);
                if (tempLine == 0) {
                    writeFileLine.println(line);
                }
                //System.out.println(Arrays.toString(shoesStr));

            }
            scanner.close();
            writeFileLine.close();
        } catch (FileNotFoundException x) {
            System.out.println("Файл не найден");
        } catch (ArrayIndexOutOfBoundsException e) { // перенес в конец
            System.out.println("Ошибка: Некорректная строка в файле или файл пуст");
        }
    }
}
