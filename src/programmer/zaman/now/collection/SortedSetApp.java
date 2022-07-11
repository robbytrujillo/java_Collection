package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;
import programmer.zaman.now.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {

          public static void main(String[] args) {

              SortedSet<Person> people = new TreeSet<>(new PersonComparator());

              people.add(new Person("Robby"));
              people.add(new Person("Ilham"));
              people.add(new Person("Kusuma"));

              for (var person : people) {
                  System.out.println(person.getName());
              }

              SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
             // sortedSet.add(new Person("Obby"));
      }
    }

