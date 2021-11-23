package day6;

public class Motorbike {
    private String modelMotorbike;
    private String colorMotorbike;
    private int yearOfMotorbike;

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public Motorbike(String modelMotorbike, String colorMotorbike, int yearOfMotorbike) {
        this.modelMotorbike = modelMotorbike;
        this.colorMotorbike = colorMotorbike;
        this.yearOfMotorbike = yearOfMotorbike;
    }

    public String getColorMotorbike() {
        return colorMotorbike;
    }

    public int getYearOfMotorbike() {
        return yearOfMotorbike;
    }

    public int yearDifference(int year) {
        int dif = 0;
        if (year > this.yearOfMotorbike) {
            dif = year - this.yearOfMotorbike;
        }
        return dif;
    }

    public String getModelMotorbike() {
        return modelMotorbike;
    }

    public int getYearMotorbike() {
        return yearOfMotorbike;
    }
}
