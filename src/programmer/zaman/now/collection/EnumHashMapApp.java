package programmer.zaman.now.collection;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class EnumHashMapApp {
    public static enum Level {
        FREE, STANDAR, PREMIUM, VIP
    }

    public static void main(String[] args) {

        Map<Level, String> map = new EnumMap<Level, String>(Level.class);
        map.put(Level.FREE, "Robby");
        map.put(Level.PREMIUM, "Ilham");

        for (var key : map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
