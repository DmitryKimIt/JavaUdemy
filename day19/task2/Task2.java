package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/taxi_cars.txt");
        HashMap<Integer, Point> hashMap = new HashMap<>();
        List<Integer> inSquare = new ArrayList<>();
        Scanner scanner = new Scanner("");
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] numbersStr = line.split(" ");
                hashMap.put(Integer.parseInt(numbersStr[0]), new Point(Integer.parseInt(numbersStr[1]), Integer.parseInt(numbersStr[2])));
            }
            Scanner scannerXY = new Scanner(System.in);
            System.out.print("Ввведите координату квадрата x1: ");
            int x1 = scannerXY.nextInt();
            System.out.print("Ввведите координату квадрата y1: ");
            int y1 = scannerXY.nextInt();
            System.out.print("Ввведите координату квадрата x2: ");
            int x2 = scannerXY.nextInt();
            System.out.print("Ввведите координату квадрата y2: ");
            int y2 = scannerXY.nextInt();
            if (x1 > x2 || y1 < y2 || (x2 - x1) != (y1 - y2) || x1 > 99 || x2 > 99 || y1 > 99 || y2 > 99 || x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0)
                throw new InputMismatchException();
            scannerXY.close();
            for (HashMap.Entry<Integer, Point> element : hashMap.entrySet()) {
                if (element.getValue().getX() > x1 && element.getValue().getX() < x2 && element.getValue().getY() < y1 && element.getValue().getY() > y2) {
                    inSquare.add(element.getKey());
                }
            }
            System.out.println(inSquare);
            System.out.println("Количество машин в квадрате: " + inSquare.size());
        } catch (InputMismatchException sd) {
            System.out.println("Введена неправильная координата");
        } catch (FileNotFoundException d) {
            System.out.println("файл не найден");
            scanner.close();
        }

    }
}

