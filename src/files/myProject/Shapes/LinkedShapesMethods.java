package files.myProject.Shapes;
// Shape.java (Base Class)
class Shape {
    public double area() {
        System.out.println("Area of Shape not defined.");
        return 0;
    }
}

class RectangleShape extends Shape {
    double length;
    double width;

    public RectangleShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class CircleShape extends Shape {
    double radius;

    public CircleShape(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
public class LinkedShapesMethods {
    public static void main(String[] args) {

        Shape myShape = new Shape();
        System.out.println("Shape Area: " + myShape.area());

        RectangleShape myRectangle = new RectangleShape(5, 10);
        System.out.println("Rectangle Area: " + myRectangle.area());

        CircleShape myCircle = new CircleShape(7);
        System.out.println("Circle Area: " + myCircle.area());
    }
}
