package files.myProject.Shapes;

import java.util.Scanner;

class Rectangle {
    int length, width;

    public void calculateArea() {
        int area = length * width;
        System.out.println("Area of Rectangle is: " + area);
    }

    public void calculatePerimeter() {
        int perimeter = 2 * (length + width); // Corrected perimeter calculation
        System.out.println("Perimeter of Rectangle is: " + perimeter);
    }
}

public class ShapesCalculator {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(); // Corrected the object creation
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        rectangle.length = scanner.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        rectangle.width = scanner.nextInt();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        scanner.close(); // Best practice to close the scanner
    }
}
