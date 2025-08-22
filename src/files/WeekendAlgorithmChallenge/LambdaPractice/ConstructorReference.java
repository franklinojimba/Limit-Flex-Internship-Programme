package files.WeekendAlgorithmChallenge.LambdaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Person{
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class ConstructorReference {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Megan", "Alexander", "Bob"));
        List<Person> person = names.stream().map(Person::new).toList();
        System.out.println(person);

        names.sort(String::compareToIgnoreCase);
        System.out.println("Sorted names: " + names);
    }
}
