package day9.Task2;

public class Circle extends Figure {
    private double radius;

    public Circle(int radius,String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return radius*2*Math.PI;
    }
}
