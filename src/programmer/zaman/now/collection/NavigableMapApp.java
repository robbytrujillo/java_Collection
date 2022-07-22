package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Robby", "Robby");
        map.put("Dody", "Dody");
        map.put("Alex", "Alex");

        for (var key : map.keySet() ){
            System.out.println(key);
        }
        System.out.println(map.lowerKey("Robby"));
        System.out.println(map.higherKey("Robby"));
        System.out.println(map.floorKey("Amad"));
        System.out.println(map.ceilingKey("Amad"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet() ){
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable
                = Collections.unmodifiableNavigableMap(mapDesc);

        //immutable.put("Robby", "Robby"); //error
    }
}
