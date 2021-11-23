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
            x = (int) Math.round(b);
            switch (x) {
                case 0:
                    System.out.println("Деление на 0");
                    continue;
                default:
                    System.out.println(a / b);
            }

        }

    }
}
