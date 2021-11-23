package day5;

public class Motorbike {
    private String modelMotorbike;
    private String colorMotorbike;
    private int yearOfMotorbike;


    public Motorbike(String modelMotorbike, String colorMotorbike, int yearOfMotorbike){
        this.modelMotorbike =   modelMotorbike;
        this.colorMotorbike= colorMotorbike;
        this.yearOfMotorbike = yearOfMotorbike;
    }

    public String getColorMotorbike() {
        return colorMotorbike;
    }
    public int getYearOfMotorbike() {
        return yearOfMotorbike;
    }

    public String getModelMotorbike() {
        return modelMotorbike;
    }
}
