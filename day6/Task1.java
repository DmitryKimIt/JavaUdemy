package day6;

public class Task1 {
    public static void main(String[] args) {
        Car mazdaCX5 = new Car();
        mazdaCX5.setModelCar("CX-5");
        mazdaCX5.setYear(2017);
        Motorbike hondaMotoBike = new Motorbike("Honda", "green", 2007);
        mazdaCX5.info();
        hondaMotoBike.info();
        int inputyear =2020;
        int diff = mazdaCX5.yearDifference(inputyear);
        System.out.println("Год выпуска автомобиля "+mazdaCX5.getYearOfCar()+", и год для сравнения "+inputyear);
        inputyear =2020;
        diff = hondaMotoBike.yearDifference(inputyear);
        System.out.println("Год выпуска мотоцикла "+hondaMotoBike.getYearMotorbike()+", и год для сравнения "+inputyear);

    }
}
