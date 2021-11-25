package day8;

public class Airplane {
    private String producer; // (изготовитель)
    private int year; // (год выпуска)
    private int length; // (длина)
    private int weight; // (вес)
    private int fuel; // (количество топлива в баке)

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, количество топлива в баке: %d %n", this.producer, this.year, this.length, this.weight, this.fuel);
    }

    public void fillUp(int n) {
        this.fuel += n;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return String.format("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, количество топлива в баке: %d", this.producer, this.year, this.length, this.weight, this.fuel);
    }
}
