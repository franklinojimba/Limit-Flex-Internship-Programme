package files.myProject.Rentals;
class FranklinRentals {
    String model;
    int year;
    double price;
    boolean availableForRent;

    public FranklinRentals(String model, int year, double price){
        this.model = model;
        this.year = year;
        this.price = price;
        availableForRent = true;
    }

    public void rentCar(){
        if(availableForRent){
            availableForRent = false;
            System.out.println("You have rented "+ model+ " " + year + ".");
        }
        else{
            System.out.println(model+ " " + year + " is not available for rent.");
        }
    }
    public void returnCar(){
        if(!availableForRent){
            availableForRent = true;
            System.out.println("You have returned "+ model+ " " + year + ".");
        }
        else{
            System.out.println(model+ " " + year + " was not rented.");
        }
    }
    public void displayCar(){
        System.out.println("Model: " + model + " | Year: " + year + " | Price: " + price + " | Availability: " + (availableForRent ? "Yes" : "No"));
    }
}
public class CarRental {
    public static void main(String[] args) {
        FranklinRentals carStore = new FranklinRentals("Mercedes", 2020, 150000000);
        carStore.rentCar();
        carStore.displayCar();
        carStore.returnCar();
        carStore.displayCar();
        carStore.returnCar();
        carStore.displayCar();
    }
}