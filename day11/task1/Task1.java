package day11.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Worker> employees = new ArrayList<>();
        Warehouse warehouse = new Warehouse();
        Warehouse warehouse2 = new Warehouse();
        employees.add(new Picker(warehouse));
        employees.add(new Courier(warehouse));

        for (Worker x : employees) {
        workerDo(x);
        System.out.println(x);
        System.out.println(warehouse);
        }
    }

    public static void workerDo(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
