package files.UdemyLessons.LambdaExpressions;

interface StringTest{
    boolean test(String o, String p);
}
public class StringTextExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        StringTest stringTest;
        stringTest = String::contains;
        System.out.println("- - - Testing - - - ");
        System.out.println();

        if (stringTest.test("hallowed", "world")) {
            System.out.println("hallowed is containing world");
        }
        else {
            System.out.println("Hello is not containing world");
        }
    }
}
