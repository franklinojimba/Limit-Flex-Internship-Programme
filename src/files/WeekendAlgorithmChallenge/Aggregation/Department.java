package files.WeekendAlgorithmChallenge.Aggregation;

public class Department {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Employee[] emp = new Employee[3];
        emp[0] = new Employee("Mary", 24);
        emp[1] = new Employee("Jack", 25);
        emp[2] = new Employee("Jane", 26);
        for (Employee employee : emp) {
            System.out.println(employee);
        }
    }
}
