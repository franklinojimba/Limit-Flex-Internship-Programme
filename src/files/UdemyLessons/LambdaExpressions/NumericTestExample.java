package files.UdemyLessons.LambdaExpressions;

interface NumericTest{
    boolean test(int n, int m);
}

public class NumericTestExample{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        NumericTest myTest;

        myTest = (n, d) -> (n % d) == 0;
        if(myTest.test(10, 2))
            System.out.println("2 is a factor of 10");

        myTest = (n, m) -> (n < m);
        if(myTest.test(2, 10))
            System.out.println("2 is less than 10");

        myTest = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
        if(myTest.test(4, -4))
            System.out.println("Absolute values of 4 and -4 are equal.");


    }
}
