package programmer.zaman.now.collection;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);

        sortedMap.put("Robby", "Robby");
        sortedMap.put("Ilham", "Ilham");
        sortedMap.put("Kusuma", "Kusuma");

        for (var key : sortedMap.keySet()) {
            System.out.println(key);
        }

    }

}
