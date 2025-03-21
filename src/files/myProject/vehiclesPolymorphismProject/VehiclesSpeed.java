package files.myProject.vehiclesPolymorphismProject;

class modernVehicles {
    public void speed(int speed) {
        System.out.println("This method measures the speed of different vehicles.");
    }
}

class NewCar extends modernVehicles {

    public void speed(int carSpeed) {
        System.out.println("-- The car is travelling at: " + carSpeed + " km/h");
    }
}

class Bike extends modernVehicles {
    public void speed(int bikeSpeed) {
        System.out.println("-- The bike is travelling at: " + bikeSpeed + " km/h");
    }
}

public class VehiclesSpeed {
    public static void main(String[] args) {
        modernVehicles accelerator;  // Polymorphic reference

        accelerator = new modernVehicles();
        accelerator.speed(0);

        accelerator = new NewCar();
        accelerator.speed(7);

        accelerator = new Bike();
        accelerator.speed(8);
    }
}
