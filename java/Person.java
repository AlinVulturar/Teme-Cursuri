package curs11Teme.java;
import java.util.*;
import java.util.stream.Collectors;

    public class Person {
        public static void main(String[] args) {

            List<Person> persons = new ArrayList<>();
            persons.add(new Person("John", 25, "brown"));
            persons.add(new Person("Sarah", 30, "blonde"));
            persons.add(new Person("Mike", 20, "black"));
            persons.add(new Person("Emily", 35, "red"));
            persons.add(new Person("David", 28, "brown"));


            List<String> names = persons.stream().map(Person::getName).collect(Collectors.toList());
            System.out.println("List of person names: " + names);


            Map<String, Integer> nameToAge = persons.stream().collect(Collectors.toMap(Person::getName, Person::getAge));
            System.out.println("Map from person's name to their age: " + nameToAge);


            int givenAge = 27;
            List<Person> olderPersons = persons.stream().filter(p -> p.getAge() > givenAge).collect(Collectors.toList());
            System.out.println("Persons older than " + givenAge + ": " + olderPersons);


            Map<String, List<String>> hairColourToName = persons.stream()
                    .collect(Collectors.groupingBy(Person::getHairColour, Collectors.mapping(Person::getName, Collectors.toList())));
            System.out.println("Map from person's hair colour to their name: " + hairColourToName);


            Map<Integer, List<Person>> ageToPersons = persons.stream().collect(Collectors.groupingBy(Person::getAge));
            System.out.println("Map from age to list of persons: " + ageToPersons);
        }
    }

    class Person {
        private String name;
        private int age;
        private String hairColour;

        public Person(String name, int age, String hairColour) {
            this.name = name;
            this.age = age;
            this.hairColour = hairColour;
        }

        public String getName() {
}
