package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file1 = new File("./src/main/java/day14/people.txt");
        System.out.println(parseFileToObjList(file1));
    }
    public static List<Person> parseFileToObjList(File file){
        List <Person> array = new ArrayList<>();
        String[] ageStr = new String[2];
        Scanner scanner = new Scanner("");
        try {
            scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String line =scanner.nextLine();
            ageStr=line.split(" ");
            if(Integer.parseInt(ageStr[1])<0){
                throw new IOException();
            }
            Person person = new Person(ageStr[0],Integer.parseInt(ageStr[1]));
            array.add(person);
        }
        }
        catch(FileNotFoundException x){
            System.out.println("Файл не найден");
        }
        catch(IOException e){
            System.out.println("Некорректный входной файл");
        }
        return array;
    }

}
