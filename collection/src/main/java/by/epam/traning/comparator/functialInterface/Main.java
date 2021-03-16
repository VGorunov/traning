package by.epam.traning.comparator.functialInterface;


import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(701, "Bob"));
        people.add(new Person(901, "Bob"));
        people.add(new Person(301, "Vasili"));
        people.add(new Person(501, "Vasili"));
        people.add(new Person(201, "Vasili"));
        people.add(new Person(801, "Dmitry"));
        System.out.println(people);

        people.sort(((o1, o2) -> o1.getPersonId() - o2.getPersonId()));
        System.out.println(people);

        people.sort(Comparator.comparing(Person::getName).thenComparing(Person::getPersonId));
    }
}
