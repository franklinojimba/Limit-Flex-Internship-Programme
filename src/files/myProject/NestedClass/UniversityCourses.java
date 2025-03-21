package files.myProject.NestedClass;
class University{
    static class Department{
        public void course(String course){
            System.out.println("I am currently learning " + course);
        }
    }
}
public class UniversityCourses {
    public static void main(String[] args) {
        University.Department myDepartment = new University.Department();
        myDepartment.course("Java");
    }
}
