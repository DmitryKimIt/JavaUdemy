package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int max, min, numEndOf0, sumNumOfEnd0, sumElementsArray;
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;
        numEndOf0 =0;
        sumNumOfEnd0 =0;
        sumElementsArray=0;
        for (int j : array) {
            sumElementsArray+=j;
            if (j>max) max=j;
            if (j<min) min=j;
            if (j%10==0) numEndOf0++;
            if (sumElementsArray%10==0) sumNumOfEnd0++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("наибольший элемент массива " + max);
        System.out.println("наименьший  элемент массива " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + numEndOf0);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sumNumOfEnd0);
    }
}
