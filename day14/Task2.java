package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("./src/main/java/day14/people.txt");
        System.out.println(parseFileToStringList(file1));
    }
    public static List<String> parseFileToStringList(File file){
        List <String> array = new ArrayList<>();
        String[] ageStr = new String[2];
        Scanner scanner = new Scanner("");
        try {
            scanner = new Scanner(file);
        }
        catch(FileNotFoundException x){
            System.out.println("Файл не найден");
        }

        while (scanner.hasNextLine()){
            String line =scanner.nextLine();
            array.add(line);
            ageStr=line.split(" ");
            if(Integer.parseInt(ageStr[1])<0){
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл");
                    return null;
                }
            }
        }
        return array;
    }
}
