package files.WeekendAlgorithmChallenge.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class CustomAgeComparator {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Tovia", 59));
        people.add(new Person("Nathaniel", 33));
        people.add(new Person("Daniel", 40));
        people.sort((s1,s2) -> Integer.compare(s1.getAge(), s2.getAge()));
        System.out.println(people);

        List<Integer> newDigits = new ArrayList<>(Arrays.asList(12,4,5,3,2,5));
        newDigits.forEach(i -> {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        });

        List<String> wordList = new ArrayList<>(Arrays.asList("Hello", "World", "Yes"));
        List<String> modifiedwordList = wordList.stream().filter(s -> s.length()>4).toList();
        System.out.println(wordList);
    }
}
