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
        collection.addAll(Arrays.asList("Programmer", "Zaman", "Now")); //cara satu
        collection.addAll(List.of("Programmer", "Zaman", "Now")); //cara dua

        for (var name : collection) { //cek data collection
            System.out.println(name);
        }

        System.out.println("REMOVE");

        collection.remove("Kusuma"); //Menghapus data collection
        collection.removeAll(List.of("Zaman", "Now")); //Menghapus sumua data pilihan collection

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(
                collection.contains("Ilham")
        );

        System.out.println(collection.containsAll(List.of("Kusuma", "Progammmer")));

        System.out.println(collection.size());
    }

}
