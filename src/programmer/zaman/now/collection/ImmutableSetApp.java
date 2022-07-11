package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Robby");

        Set<String> mutable = new HashSet<>();
        mutable.add("Robby");
        mutable.add("Ilham");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Robby", "Ilham");

        //set.add("Robby");
        //set.remove("Robby");


    }
}
