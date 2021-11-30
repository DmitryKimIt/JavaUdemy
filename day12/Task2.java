package day12;

import java.util.ArrayList;

public class Task2 {
    static ArrayList<Integer> even = new ArrayList<>();
    public static void main(String[] args) {
        addAarray(0,30);
        addAarray(300,350);
        System.out.println(even);
    }
    public static void addAarray(int a, int b){
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                even.add(i);
            }
        }
    }
}