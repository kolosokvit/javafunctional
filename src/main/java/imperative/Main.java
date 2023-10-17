package imperative;

import java.util.ArrayList;
import java.util.List;

import static imperative.Main.Gender.FEMALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", FEMALE),
                new Person("Kate", FEMALE),
                new Person("Bob", Gender.MALE),
                new Person("Nick", Gender.MALE)
        );

        //Imperative approach
        System.out.println("//Imperative approach");
        List<Person> females  = new ArrayList<>();
        for (Person person : people) {
            if (person.gender == FEMALE) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        //Declarative approach
        System.out.println("//Declarative approach");
        List<Person> females2 = people.stream()
                .filter(person -> person.gender == FEMALE)
                .toList();
        females2.forEach(System.out :: println);
    }


    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {
        MALE, FEMALE;
    }
}
