package programmer.zaman.now.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>(10);

        for (int i = 0; i < 20; i++) {
            queue.add(String.valueOf(i));
        }

        for (String next = queue.poll(); next != null; next= queue.poll()) {
            System.out.println(next);
        }

    }
}
