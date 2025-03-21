package files.myProject;
import java.util.Scanner;

class Student {
    private final String name;
    private final int matricNo;
    private final double subject1,subject2,subject3;

    public Student(String name, int matricNo, double subject1, double subject2, double subject3) {
        this.name = name;
        this.matricNo = matricNo;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    public double calculateAverage() {
        return (subject1 + subject2 + subject3) / 3;
    }
    public void revealDetails() {
        System.out.println("Name: " + name);
        System.out.println("MatricNo: " + matricNo);
        System.out.println("Average score: " + calculateAverage());

    }
}
public class StudentDetails {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name = myScanner.nextLine();
        System.out.println("Enter the matric number of the student: ");
        int matricNo = myScanner.nextInt();
        System.out.println("Enter the score of subject 1: ");
        double subject1 = myScanner.nextDouble();
        System.out.println("Enter the score of subject 2: ");
        double subject2 = myScanner.nextDouble();
        System.out.println("Enter the score of subject 3: ");
        double subject3 = myScanner.nextDouble();
        Student student = new Student(name, matricNo, subject1, subject2, subject3);
        student.revealDetails();
        myScanner.close();
    }
}
