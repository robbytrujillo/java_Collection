package programmer.zaman.now.collection;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Robby", "Ilham", "Kusuma", "Programmer", "Zaman", "Now"));

        NavigableSet<String> namesReverse = names.descendingSet();
      //  NavigableSet<String> ilham = names.headSet("Ilham", true); //paling depan
        NavigableSet<String> ilham = names.tailSet("Ilham", true); //paling belakang

//        for (var name : namesReverse) {
//            System.out.println(name);
//        }

        for (var name : ilham) {
            System.out.println(name);
        }

    }
}
