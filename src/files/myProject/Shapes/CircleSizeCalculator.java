package files.myProject.Shapes;

import java.util.Scanner;


class Circle {
    double radius;
    double area;
    double circumfrence;

    public void circleArea() {
        area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);
    }
    public void circlePerimeter() {
        circumfrence = 2 * Math.PI * radius;
        System.out.println("The perimeter of the circle is " + circumfrence);
    }
}
public class CircleSizeCalculator {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        circle.radius = input.nextDouble();
        circle.circleArea();
        circle.circlePerimeter();
    }
}