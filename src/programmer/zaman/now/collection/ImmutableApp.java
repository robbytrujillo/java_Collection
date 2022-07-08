package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();
        List<String> mutable = new ArrayList<>();
        mutable.add("Robby");
        mutable.add("Ilham");
        List<String> immutable = Collections.unmodifiableList(mutable);
        List<String> elements = List.of("Robby", "Ilham", "Kusuma");
        //elements.add("Masbro");
        System.out.println(elements);
    }
}
