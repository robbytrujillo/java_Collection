package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionDefaultMethodApp {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1 ; i < 100; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
    }
}
