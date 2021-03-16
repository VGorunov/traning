package by.epam.traning.comparator.outer;


import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(701, "Bob1"));
        people.add(new Person(901, "Jack9"));
        people.add(new Person(301, "Vasili"));
        people.add(new Person(801, "Dmitry"));
        System.out.println(people);

        people.sort(new PersonNameComparator());
        System.out.println(people);


        Collections.sort(people, new PersonNameComparator());
    }
}
