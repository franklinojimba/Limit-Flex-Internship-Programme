package files.myProject;

import java.util.Scanner;

class Calculate{
    public void addition(int x, int y){
        int addAns = x+y;
        System.out.println("Addition: " + addAns);
    }
    public void subtraction(int x, int y){
        int subAns = x-y;
        System.out.println("Subtraction: " + subAns);
    }
    public void multiplication(int x, int y){
        int multiAns = x*y;
        System.out.println("Multiplication: " + multiAns);
    }
    public void division(int x, int y){
        double divAns = (double) x/y;
        System.out.println("Division: " + divAns);
    }
}
public class UserInputCalculator {
    public static void main(String[] args) {
        Scanner scanNumber =  new Scanner(System.in);
        System.out.println("Input the value of x: ");
        int x = scanNumber.nextInt();
        System.out.println("Input the value of y: ");
        int y = scanNumber.nextInt();
        Calculate calc = new Calculate();
        calc.addition(x, y);
        calc.subtraction(x, y);
        calc.multiplication(x, y);
        calc.division(x, y);
    }
}
