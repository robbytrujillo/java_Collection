package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Robby");

        person.addHobby("Coding");
        person.addHobby("Hiking");

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

}
