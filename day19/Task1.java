package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        int max;
        String key = "";
        File file = new File("./src/main/resources/dushi.txt");
        HashMap<String, Integer> hashMap = new HashMap<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            scanner.useDelimiter("[…“„№\\-\\—.,:;()?<>«»\\[\\]!\"\\s–]+");
            String word = "";
            while (scanner.hasNext()) {
                word = scanner.next().toLowerCase();
                int sum = 0;
                if (hashMap.containsKey(word)) {
                    sum = hashMap.get(word);
                    hashMap.put(word, sum + 1);
                } else {
                    hashMap.put(word, 1);
                }
            }
            HashMap<String, Integer> hashMapCopy = new HashMap<>(hashMap);
            LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
            for (int i = 0; i < 100; i++) {
                max = Integer.MIN_VALUE;
                for (HashMap.Entry<String, Integer> element : hashMapCopy.entrySet()) {
                    if (element.getValue() >= max) {
                        max = element.getValue();
                        key = element.getKey();
                    }
                }
                hashMapCopy.remove(key, max);
                linkedHashMap.put(key, max);
            }
            System.out.println(linkedHashMap);
            //чичиков=608
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        scanner.close();
    }

}
