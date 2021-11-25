package day8;

import javafx.beans.binding.StringBinding;

public class Task1 {
    public static void main(String[] args) {
        String immutStroke = "";
        StringBuilder mutstroke = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            immutStroke += String.valueOf(i);
            immutStroke += " ";
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы конкатенация, в мс.: " + (stopTime - startTime));
        startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            mutstroke.append(String.valueOf(i));
            mutstroke.append(" ");
        }
        stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы StringBuilder, в мс.: " + (stopTime - startTime));


    }
}
