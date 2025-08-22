package files.WeekendAlgorithmChallenge.OverridenString;

public class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student -> [" +
                "Age=" + age +
                ",Name='" + name + '\'' +
                ']';
    }

    public static void main(String[] args) {
        Student s1 = new Student("John", 25);
        System.out.println(s1);
    }
}
