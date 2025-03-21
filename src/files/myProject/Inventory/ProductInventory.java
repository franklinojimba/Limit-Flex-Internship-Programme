package files.myProject.Inventory;
class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void addToStock(int amountToBeAdded) {
        quantity  = quantity + amountToBeAdded;
        System.out.println(amountToBeAdded + " has been added to the stock. New quantity is " + quantity);
    }
    public void subtractFromStock(int amountToBeSubtracted) {
        quantity = quantity - amountToBeSubtracted;
        System.out.println("amount to be subtracted is " + amountToBeSubtracted+"units. New quantity is " + quantity);
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
public class ProductInventory {
    public static void main(String[] args) {
        Product myProduct = new Product("Bitcoin", 89000000, 2);
        myProduct.addToStock(1);
        myProduct.addToStock(2);
        myProduct.display();

    }
}
