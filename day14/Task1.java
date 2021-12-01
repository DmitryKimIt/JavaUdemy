package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        File file = new File("./src/main/java/day14/read.txt");

        printSumDigits(file);

    }
    public static void printSumDigits (File file) {
        int sumNumbersInt = 0;
        Scanner scanner=new Scanner("");
        try {
            scanner = new Scanner(file);
        }
        catch(FileNotFoundException d){
            System.out.println("файл не найден");
        }
        String line =  scanner.nextLine();
        //System.out.println(line);
        String [] numbersStr = line.split(" ");
        if (numbersStr.length!=10){
            try {
                throw new IOException();
            }
            catch (IOException e){
                System.out.println("Некорректный входной файл");
            }
        }
        for (int i = 0; i < numbersStr.length ; i++) {
            sumNumbersInt+=Integer.parseInt(numbersStr[i]);
        }
        System.out.println(sumNumbersInt);
        scanner.close();
    }

}
