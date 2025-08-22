package files.WeekendAlgorithmChallenge.Vehicles;

public abstract class Vehicle {
    abstract void move();
}
 class myCar extends Vehicle {
    public void move() {
        System.out.println("The Car is moving!!");
    }
}
class myBike extends Vehicle {
    public void move() {
        System.out.println("The Bike is moving!!");
    }

    public static void main(String[] args) {
        Vehicle v = new myCar();
        v.move();
        Vehicle v2 = new myBike();
        v2.move();
    }
}
