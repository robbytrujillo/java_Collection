package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {

          public static void main(String[] args) {

              SortedSet<Person> people = new TreeSet<>();

              people.add(new Person("Robby"));
              people.add(new Person("Ilham"));
              people.add(new Person("Kusuma"));

              for (var person : people)
      }
    }

