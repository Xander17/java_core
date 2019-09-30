package collections.uniqwords;

import java.util.HashMap;
import java.util.Map;

public class UniqWords {
    private static Map<String, Integer> map;

    public static void analizeArray(String[] array) {
        createMap(array);
        printStat();
    }

    private static void createMap(String[] array) {
        map = new HashMap<>();
        for (String s : array) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
    }

    private static void printStat() {
        System.out.println("Статистика слов в массиве:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
