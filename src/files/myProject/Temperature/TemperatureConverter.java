package files.myProject.Temperature;

import java.util.Scanner;

class Converter {
    double temperature;

    public Converter(double temperature) {
        this.temperature = temperature;
    }

    public double convertToFahrenheit() {
        return (temperature * 9 / 5) + 32;
    }

    public double convertToCelsius() {
        return (temperature - 32) * 5 / 9;
    }
}

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = myScanner.nextDouble();
        myScanner.nextLine();

        System.out.print("Is the temperature in Celsius or Fahrenheit? ");
        String tempUnit = myScanner.nextLine();

        Converter converter = new Converter(temperature);

        if (tempUnit.equalsIgnoreCase("Celsius")) {
            System.out.println("Your temperature is " + converter.convertToFahrenheit() + "°F in Fahrenheit.");
        } else if (tempUnit.equalsIgnoreCase("Fahrenheit")) {
            System.out.println("Your temperature is " + converter.convertToCelsius() + "°C in Celsius.");
        } else {
            System.out.println("Invalid Temperature Unit. Please enter 'Celsius' or 'Fahrenheit'.");
        }

        myScanner.close();
    }
}
