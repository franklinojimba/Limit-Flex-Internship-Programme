package files.WeekendAlgorithmChallenge.Shapes;

abstract class Shape{
    abstract double area();
}
class Circle extends Shape{
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape{
    private final double length;
    private final double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length * width;
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(2), new Rectangle(20, 3.5)};
        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
    }
}