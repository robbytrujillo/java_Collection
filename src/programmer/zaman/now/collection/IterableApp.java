package programmer.zaman.now.collection;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {

        Iterable<String> names = List.of("Robby", "Ilham", "Kusuma");

        for (var name: names) {
            System.out.println(name);
        }
    }
}
