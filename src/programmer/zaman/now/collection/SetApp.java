package programmer.zaman.now.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

        //Set<String> names = new HashSet<>();//hasilnya tidak berurut
        Set<String> names = new LinkedHashSet<>(); //hasilnya berurut,
        // karena didalemnya ada struktur data double linkedlist untuk memaintenance

        names.add("Robby");
        names.add("Ilham");
        names.add("Kusuma");
        names.add("Robby");
        names.add("Ilham");
        names.add("Kusuma");

        for (var name : names) {
            System.out.println(name);
        }
    }
//perbedaan list dan set yaitu,
// jika butuh list yaitu ketika kita tidak peduli duplikat atu gak struktur datanya
//jika set yaitu ketika data yang di dalam set itu unique yaitu yang tidak ada duplicate

}
