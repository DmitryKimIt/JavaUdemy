package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, value;
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (b > a) {
            value = a + 1;
            while (value < b) {
                if (value % 5 == 0 && value % 10 != 0) System.out.print(value + " ");
                value++;
            }
        } else System.out.println("Некорректный ввод");
    }

}

