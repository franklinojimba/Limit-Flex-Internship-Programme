package files.myProject;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private final String name;
    private final int salary;
    private final String position;

    public Employee(String name, int salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }
    public void initialize(){
        System.out.println("Name: " + name  + ", Salary: " + salary + ", Position: " + position);
    }
}
public class EmployeeManagement {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Enter the name of the employee: ");
        String name = input.nextLine();

        System.out.print("Enter the salary of the employee: ");
        int salary = input.nextInt();
        input.nextLine();

        System.out.print("Enter the position of the employee: ");
        String position = input.nextLine();

        Employee employee = new Employee(name, salary, position);
        employee.initialize();
        input.close();
    }
}
