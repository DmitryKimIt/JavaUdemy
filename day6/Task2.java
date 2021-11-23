package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane boing356 = new Airplane("Boing", 2016, 200, 2000);
        boing356.setYear(2018);
        boing356.setLength(220);
        boing356.fillUp(100);
        boing356.fillUp(400);
        boing356.info();
    }
}
