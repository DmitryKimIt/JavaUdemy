package day11.task1;

import java.util.ArrayList;

public class Picker implements Worker {
    private int salary; // (заработная плата)
    private final int TASK = 80;
    private boolean isPayed; // (был выплачен бонус или нет)
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += TASK;
        warehouse.CountPickedPlus();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70000;
        isPayed = true;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }


}
