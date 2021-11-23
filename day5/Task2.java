package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike hondaMotoBike = new Motorbike("Honda", "green", 2007);
        System.out.println("модель мотобайка: " + hondaMotoBike.getModelMotorbike());
        System.out.println("цвет мотобайка: " + hondaMotoBike.getColorMotorbike());
        System.out.println("год выпуска мотобайка: " + hondaMotoBike.getYearOfMotorbike());
    }
}
