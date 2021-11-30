package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        MusicBand teorySound = new MusicBand("Теория звука",2015, Arrays.asList("Иван Ларионов", "Алексей Будников", "Дмитрий Шаморов", "Денис Мысенко"));
        MusicBand ezhprom = new MusicBand("Ezhprom",2015, Arrays.asList("Сергей Сабуров", "Дмитрий Da Fat", "Илья Mosquite"));
        MusicBand.transferMembers(teorySound,ezhprom);

    }

}
