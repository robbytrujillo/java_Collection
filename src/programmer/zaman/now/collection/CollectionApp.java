package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Robby");
        collection.add("Ilham");
        collection.add("Kusuma");
        collection.addAll(Arrays.asList("Programmer", "Zaman", "Now" )); //cara satu
        collection.addAll(List.of("Programmer", "Zaman", "Now")); //cara dua

        for (var name : collection) {
            System.out.println(name);
        }

    }
}
