package files.WeekendAlgorithmChallenge;

public class MathOperations {
    public void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }
    public void add(double num1, double num2) {
        double result = num1 + num2;
        System.out.println(result);

    }
    public void add(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        System.out.println(result);    }

    
    public static void main(String[] args) {
        MathOperations addMethod = new MathOperations();
        addMethod.add(3.2, 5.4);
        addMethod.add(3, 5);
        addMethod.add(4, 5, 6);
    }
}
