package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)  {
        PrintWriter file1 = null;
        PrintWriter file2 = null;
        Scanner scanner = null;
        try {
            file1 = new PrintWriter("./src/main/java/day16/file1.txt");
            file2 = new PrintWriter("./src/main/java/day16/file2.txt");
            scanner = new Scanner(new File("./src/main/java/day16/file1.txt"));
        final int size = 1000; //- количество чисел
// Ревлизация 1го пуекта запись в файл1 случайных чисел
        for (int i=0; i< size ; i++) {
            file1.printf("%d ",(int)(Math.random()*100));
        }
            file1.close();
// Ревлизация 2го пункта? считывание и запись в файл2
        double sumNum=0.0;
        String line =  scanner.nextLine();
        String[] numbersStr = line.split(" ");
        for (int i = 0; i < numbersStr.length ; i++) {
            sumNum += Integer.parseInt(numbersStr[i]);
         if (i%20==0){
             file2.printf(sumNum/20+" ");
             sumNum = 0.0;
         }
        }
            printResult(new File("./src/main/java/day16/file1.txt"));
            file2.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (NumberFormatException e) {
            System.out.println("Числовой формат не найден");
        }
    }
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("./src/main/java/day16/file1.txt"));
        double sumNum=0.0;
        String line =  scanner.nextLine();
        String[] numbersStr = line.split(" ");
        for (int i = 0; i < numbersStr.length ; i++) {
            sumNum+= Integer.parseInt(numbersStr[i]);
        }
        System.out.printf("%.0f",sumNum);
        scanner.close();
    }
}
