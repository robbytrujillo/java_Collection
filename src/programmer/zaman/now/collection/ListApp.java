package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        //List<String> strings = new LinkedList<>(); //sama ada dengan yang diatas

        strings.add("Robby");
        strings.add("Ilham");

        strings.set(0, "Kusuma");

        strings.remove(1);
        System.out.println(strings.get(0));

        for (var value : strings) {
            System.out.println(value);
        }
    }
}
