package files.myProject.vehiclesPolymorphismProject;
class Vehicles{
    String carName;
    String truckName;
    public Vehicles(String type1, String type2){
        this.carName = type1;
        this.truckName = type2;
    }
    public void display(){
        System.out.println("Type 1: " + carName);
        System.out.println("Type 2: " + truckName);
    }
}
public class VehicleInheritance {
    public static void main(String[] args) {
        Vehicles vehicle = new Vehicles("Car", "Truck");
        vehicle.display();
    }
}
