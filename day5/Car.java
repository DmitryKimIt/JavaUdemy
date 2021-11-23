package day5;

public class Car {
    private String modelCar;
    private String colorCar;
    private int yearOfCar;

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public void setYearOfCar(int yearOfCar) {
        this.yearOfCar = yearOfCar;
    }

    public int getYearOfCar() {
        return yearOfCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public String getModelCar() {
        return modelCar;
    }
}
