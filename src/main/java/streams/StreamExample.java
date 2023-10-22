package streams;




import java.util.List;
import java.util.stream.Collectors;


public class StreamExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE, 23),
                new Person("Maria", Gender.FEMALE, 18),
                new Person("Kate", Gender.FEMALE, 17),
                new Person("Bob", Gender.MALE, 34),
                new Person("Nick", Gender.MALE, 29)
        );

        //Collect all names from the list to a set and print each name on a new line
        people.stream().map(person -> person.name).collect(Collectors.toSet()).forEach(System.out :: println);

        //Print all person older 18
        people.stream().filter(person -> person.age >= 18).forEach(System.out :: println);

        //Check if the list contains only females
        boolean containsOnlyFemales = people.stream().allMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(containsOnlyFemales);
    }

    static class Person {
        private final String name;
        private final Gender gender;
        private final int age;

        public Person(String name, Gender gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    '}';
        }
    }
    enum Gender {
        MALE, FEMALE;
    }
}
