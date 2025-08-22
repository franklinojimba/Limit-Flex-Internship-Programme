package files.WeekendAlgorithmChallenge.Aggregation;

public class Employee {
    private final String name;
    private final int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {

        return "Employee [Name: " + name + ", PayPerHour: $" + salary + "]";
    }
}
