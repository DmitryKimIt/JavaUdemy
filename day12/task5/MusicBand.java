package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public void printMembers() {
        System.out.println(getMembers());
    }

    public static void transferMembers(MusicBand oneGroupMusic, MusicBand twoGroupMusic) {
        List<MusicArtist> twoMembers = new ArrayList<MusicArtist>(twoGroupMusic.getMembers());
        twoMembers.addAll(oneGroupMusic.getMembers());
        twoGroupMusic.members =twoMembers;
        oneGroupMusic.members =new ArrayList<MusicArtist>();
        oneGroupMusic.printMembers();
        twoGroupMusic.printMembers();
    }
    public List<MusicArtist> getMembers() {
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
