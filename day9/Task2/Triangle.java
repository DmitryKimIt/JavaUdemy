package day9.Task2;

public class Triangle extends Figure {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree, String color) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double area() {
        // Площадь треугольника по формуле Герона
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
    }

    @Override
    public double perimeter() {
        return sideOne + sideTwo + sideThree;
    }
}
