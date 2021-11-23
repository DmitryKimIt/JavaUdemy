package day5;

public class Task1 {
    public static void main(String[] args) {
        Car mazdaCX5 = new Car();
        mazdaCX5.setModelCar("CX-5");
        mazdaCX5.setColorCar("белый перламутр");
        mazdaCX5.setYearOfCar(2017);
        System.out.println("модель авто: " + mazdaCX5.getModelCar());
        System.out.println("цвет: " + mazdaCX5.getColorCar());
        System.out.println("год выпуска: " + mazdaCX5.getYearOfCar());
    }
}
