package day11.task1;

public class Warehouse {
    private int countPickedOrders; //количество собранных заказов
    private int countDeliveredOrders; // количество доставленных заказов

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void countDeliveredPlus() {
        countDeliveredOrders ++;
    }

    public void countPickedPlus() {
        countPickedOrders++;
    }
}
