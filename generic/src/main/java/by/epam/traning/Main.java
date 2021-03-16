package by.epam.traning;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // до Java 5, появления generics
        List list = new ArrayList();
        list.add(new Student());
        list.add(new String());
        list.add(new Person());
        Object obj = list.get(2);


        // после Java 5
        List<Student> students = new ArrayList<>();
        students.add(new Student());
        // students.add(new String());
        // students.add(new Person());

        List<Person> people = new ArrayList<>();
        people.add(new Person());
        people.add(new Student());

        //wildcard
        List<Person> personList = new ArrayList<>();
        personList.add(new Person());
        personList.add(new Student());
        action(people);

        List<Student> studentList = new ArrayList<>();
        //action(studentList);
        actionWildcard(studentList);

        List<Student> studentListSuper = new ArrayList<>();
        studentListSuper.add(new Student());
    }

    public static void action(List<Person> people) {

    }

    public static void actionWildcard(List<? extends Student> list) {
        // добавление в такие списки запрещено, потому что если передать List<Student> то добавление Person запрещено
        // из них можно удалять, делать из них стримы
        // list.add(new Person());
        // list.add(new Student());
        list.remove(1);
    }

    public static void actionWildcardSuper(List<? super Student> list) {
        // добавление возможно но только для объекта типа Student.
        // list.add(new Person());
        list.add(new Student());
        list.remove(1);
    }
}
