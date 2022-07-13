package programmer.zaman.now.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

       // Queue<String> queue = new ArrayDeque<>(10);
        //Queue<String> queue = new PriorityQueue<>(); //berurut sesuai abjad
        Queue<String> queue = new LinkedList<>();

//        for (int i = 0; i < 20; i++) {
//            queue.add(String.valueOf(i));
//        }

        queue.add("Robby");
        queue.add("Ilham");
        queue.add("Kusuma");

        //poll itu menghapus dan mengambil data yang paling depan
        for (String next = queue.poll(); next != null; next= queue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());

    }
}
