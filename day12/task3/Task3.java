package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> array = new ArrayList<>();
        array.add(new MusicBand("Bang Bang",2000));
        array.add(new MusicBand("Miyagi",2020));
        array.add(new MusicBand("Multfilms",1997));
        array.add(new MusicBand("Creation",1990));
        array.add(new MusicBand("Heaven",2014));
        array.add(new MusicBand("Cat",2017));
        array.add(new MusicBand("Stone",1998));
        array.add(new MusicBand("Red hot",1960));
        array.add(new MusicBand("Crime",1980));
        array.add(new MusicBand("Earth",1978));
        array.add(new MusicBand("Hands up",2005));
        array.add(new MusicBand("Brake",2008));
        Collections.shuffle(array);
        System.out.println(array);
        System.out.println(groupsAfter2000(array));
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> arrayAfter2000 = new ArrayList<>();
        final int AFTER_YEAR=2000; // после какого года отсеиваем
        for (MusicBand x: bands) {
            if (x.getYear()>AFTER_YEAR){
                arrayAfter2000.add(x);
            }
        }
        return arrayAfter2000;
    }

}
