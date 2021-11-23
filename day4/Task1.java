package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, up8 = 0, equals1 = 0, evenNumber = 0, oddNumber = 0, sumNum = 0;
        n = scanner.nextInt();
        int[] arrays = new int[n];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 10) + 1;
        }
        for (int j : arrays) {
            System.out.print(arrays[j] + ", ");
            sumNum += arrays[j];
            if (arrays[j] > 8) up8++;
            else if (arrays[j] == 1) equals1++;
            else if (arrays[j] % 2 == 0) evenNumber++;
            else if (arrays[j] % 2 != 0) oddNumber++;
        }
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + up8);
        System.out.println("Количество чисел равных 1: " + equals1);
        System.out.println("Количество четных чисел: " + evenNumber);
        System.out.println("Количество нечетных чисел: " + oddNumber);
        System.out.println("Сумма всех элементов массива: " + sumNum);
    }
}
