package programmer.zaman.now.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        //seperti descending
        stack.offerFirst("Robby");
        stack.offerFirst("Ilham");
        stack.offerFirst("Kusuma");

        //seperti berurutan
        stack.offerLast("Robby");
        stack.offerLast("Ilham");
        stack.offerLast("Kusuma");

        for (var value : stack) {
            System.out.println(value);
        }

        //ambil data keluar yang paling belakang
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>();
        queue.offerFirst("Robby");
        queue.offerFirst("Ilham");
        queue.offerFirst("Kusuma");

        //menggunakan antrian poolFirst
        System.out.println(stack.pollFirst());
        System.out.println(stack.pollFirst());
        System.out.println(stack.pollFirst());

    }

}
