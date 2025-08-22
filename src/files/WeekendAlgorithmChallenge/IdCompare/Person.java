package files.WeekendAlgorithmChallenge.IdCompare;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person> {
    private final String name;
    private final String ID;

    public Person(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return ID.equals(person.ID);
    }

    @Override
    public int hashCode() {
        return ID.hashCode();
    }

    @Override
    public int compareTo(@NotNull Person o) {
        if (this.ID.compareTo(o.ID) != 0){
            return this.ID.compareTo(o.ID);
        }
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                '}';
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Person person = new Person("22CN031552", "Smith");
        Person person2 = new Person("22CN431552", "James");
        System.out.println(person.compareTo(person2));
    }
}
