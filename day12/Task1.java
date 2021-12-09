package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> auto = new ArrayList<>(); // исправлено на List<String>
        auto.add("Audi");
        auto.add("Mazda");
        auto.add("Mersedes");
        auto.add("BMW");
        auto.add("Range Rover");

        int appMiddleIndex= 1+Math.round(auto.size()/2); // вычисляем середину, 1+ так как индексы начинаются с 0
        auto.add(appMiddleIndex,"UAZ");
        System.out.println(auto);
    }
}
