package homeworkcurs16;

import org.fasttrackit.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonService {
    private List<Person> persons;

    public PersonService(List<Person> persons) {
        this.persons = persons;
    }

    public List<String> listAllPersonsNames() {
        List<String> names = new ArrayList<>();
        for (Person person : persons) {
            names.add(person.getFirstName() + " " + person.getLastName());
        }
        return names;
    }

    public List<Person> listMajorPersons() {
        List<Person> majorPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() >= 18) {
                majorPersons.add(person);
            }
        }
        return majorPersons;
    }

    public List<Person> listPersonsFromOradea() {
        List<Person> personsFromOradea = new ArrayList<>();
        for (Person person : persons) {
            if (person.getCity().equals("Oradea")) {
                personsFromOradea.add(person);
            }
        }
        return personsFromOradea;
    }

    public List<Person> listPersonsFromOradeaOrCluj() {
        List<Person> personsFromOradeaOrCluj = new ArrayList<>();
        for (Person person : persons) {
            if (person.getCity().equals("Oradea") || person.getCity().equals("Cluj")) {
                personsFromOradeaOrCluj.add(person);
            }
        }
        return personsFromOradeaOrCluj;
    }

    public List<String> listCapitalizedFirstNames() {
        List<String> capitalizedFirstNames = new ArrayList<>();
        for (Person person : persons) {
            capitalizedFirstNames.add(person.getFirstName().toUpperCase());
        }
        return capitalizedFirstNames;
    }

    public List<String> listPersonNamesWithInitial() {
        List<String> personNamesWithInitial = new ArrayList<>();
        for (Person person : persons) {
            personNamesWithInitial.add(person.getFirstName() + " " + person.getLastName().charAt(0) + ".");
        }
        return personNamesWithInitial;
    }

    public List<Person> listPersonsBetween18And60() {
        List<Person> personsBetween18And60 = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > 18 && person.getAge() < 60) {
                personsBetween18And60.add(person);
            }
        }
        return personsBetween18And60;
    }

    public List<Person> listPersonsWithFirstNameStartingA() {
        List<Person> personsWithFirstNameStartingA = new ArrayList<>();
        for (Person person : persons) {
            if (person.getFirstName().startsWith("A")) {
                personsWithFirstNameStartingA.add(person);
            }
        }
        return personsWithFirstNameStartingA;
    }

    public List<String> listUniqueFirstNames() {
        Set<String> uniqueFirstNames = new HashSet<>();
        for (Person person : persons) {
            uniqueFirstNames.add(person.getFirstName());
        }
        return new ArrayList<>(uniqueFirstNames);
    }

    public List<Person> sortPersonsByFirstName() {
        List<Person> sortedPersons = new ArrayList<>(persons);
        Collections.sort(sortedPersons, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
        return sortedPersons;
    }

    public List<Person> sortPersonsByLastName() {
        List<Person> sortedPersons = new ArrayList<>(persons);
        Collections.sort(sorted);

        return sortedPersons;
    }