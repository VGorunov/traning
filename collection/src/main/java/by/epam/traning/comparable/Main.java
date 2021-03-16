package by.epam.traning.comparable;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person(701, "Bob1"));
        people.add(new Person(901, "Jack9"));
        people.add(new Person(301, "Vasili"));
        people.add(new Person(801, "Dmitry"));
        System.out.println(people);
    }
}
