package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members = new ArrayList<>();

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public void printMembers() {
        System.out.println(getMembers());
    }

    public static void transferMembers(MusicBand oneGroupMusic, MusicBand twoGroupMusic) {
        List<String> twoMembers = new ArrayList<>(twoGroupMusic.getMembers());
        twoMembers.addAll(oneGroupMusic.getMembers());
        twoGroupMusic.members =twoMembers;
        oneGroupMusic.members =new ArrayList<>();
        oneGroupMusic.printMembers();
        twoGroupMusic.printMembers();
    }


    public List<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

}
