package day11.task1;

public class Warehouse {
    int countPickedOrders; //количество собранных заказов
    int countDeliveredOrders; // количество доставленных заказов

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

    public void CountDeliveredPlus() {
        countDeliveredOrders ++;
    }

    public void CountPickedPlus() {
        countPickedOrders++;
    }
}
