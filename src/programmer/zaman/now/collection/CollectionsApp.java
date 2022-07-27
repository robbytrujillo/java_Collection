package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Robby", "Ilham", "Kusuma", "Programmer", "Zaman", "Now"));

        System.out.println(list);

        Collections.reverse(list); //berbalik
        System.out.println(list);

        Collections.shuffle(list); //beracak
        System.out.println(list);

    }
}
