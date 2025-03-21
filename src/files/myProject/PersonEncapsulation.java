package files.myProject;
class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double height;

    public Person(String firstName, String lastName, int age, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = (int) height;
    }
    public void displayPersonalDetails() {
        System.out.println("Full name: " + firstName + " " + lastName);
        System.out.println("Age: " + age +" years old.");
        System.out.println("Height: " + height+ "m");
    }
}
public class PersonEncapsulation {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 10, 20);
        person.setFirstName("Franklin");
        person.setLastName("Ojimba"); 
        person.setAge(19);
        person.setHeight(185);
        person.displayPersonalDetails();
    }
}
