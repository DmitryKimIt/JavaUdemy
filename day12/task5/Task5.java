package day12.task5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicBand teorySound = new MusicBand("Теория звука", 2015,
                Arrays.asList(new MusicArtist("Иван Ларионов", 25),
                        new MusicArtist("Алексей Будников", 20),
                        new MusicArtist("Дмитрий Шаморов", 24),
                        new MusicArtist("Денис Мысенко", 23)));
        MusicBand ezhprom = new MusicBand("Ezhprom", 2015,
                Arrays.asList(new MusicArtist("Сергей Сабуров", 21),
                        new MusicArtist("Дмитрий Da Fat", 20),
                        new MusicArtist("Илья Mosquite", 19)));
        MusicBand.transferMembers(teorySound, ezhprom);

    }
}
