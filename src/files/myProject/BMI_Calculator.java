package files.myProject;

import java.util.Scanner;

class PersonalDetails{
    private final double height;
    private final double weight;

    public PersonalDetails(double height, double weight){
        this.height = height;
        this.weight = weight;
    }

    public double BMICalculator(){
        return weight / (height * height);
    }

}
public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();
        System.out.print("Enter weight in KG: ");
        double weight = input.nextDouble();
        PersonalDetails personalDetails = new PersonalDetails(height, weight);
        double BMI = personalDetails.BMICalculator();
        if (BMI < 18.5){
            System.out.println("Your BMI: " + BMI);
            System.out.println("You are underweight.");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Your BMI: " + BMI);
            System.out.println("You have a normal weight.");
        }
        else if (BMI >= 25 && BMI <= 29.9){
            System.out.println("Your BMI: " + BMI);
            System.out.println("You are overweight.");
        }
        else if (BMI >= 30){
            System.out.println("Your BMI: " + BMI);
            System.out.println("You are obese.");
        }
    }

}
