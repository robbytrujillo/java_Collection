package programmer.zaman.now.collection;

import java.util.HashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Robby");
        names.add("Ilham");
        names.add("Kusuma");
        names.add("Robby");
        names.add("Ilham");
        names.add("Kusuma");

        for (var name : names) {
            System.out.println(name);
        }
    }

}
