package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Robby", "Robby Value");
        map.put("Ilham", "Ilham Value");
        map.put("Kusuma", "Kusuma Value");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (var entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

//            System.out.println("=====");
//            System.out.println("key");
//            System.out.println("=====");

        }
    }
}
