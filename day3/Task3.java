package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double a, b;
        int x;

        for (int i = 0; i < 5; i++) {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            if (b == 0) System.out.println("Деление на 0");
            else System.out.println(a / b);
        }

    }
}
