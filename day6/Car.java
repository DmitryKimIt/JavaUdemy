package day6;

public class Car {
    private String modelCar;
    private String colorCar;
    private int yearOfCar;
    public void info(){
        System.out.println("Это автомобиль");
    }
    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public void setYear(int yearOfCar) {
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
    public int yearDifference(int year) {
        int dif=0;
        if (year>this.yearOfCar){
            dif = year-this.yearOfCar;
        }
        return dif;
    }
}
