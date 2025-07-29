package files.UdemyLessons.Cars.FoodResturant;

public class MealOrder {

    public void prepareOrder(){
        System.out.println("Preparing your meal order");
    }
}
class BurgerMeal extends MealOrder {
    @Override
    public void prepareOrder() {
        System.out.println("---> One large burger, Coke, Fries");
    }
}
class ChickenMeal extends MealOrder {
    @Override
    public void prepareOrder() {
        System.out.println("---> 2 Chicken Buckets, Coke, Potatoes");
    }
}
class VeganMeal extends MealOrder {
    @Override
    public void prepareOrder() {
        System.out.println("---> 1 FruitSalad, Smoothie");
    }
}
class OrderProcess {
    public void processOrder(MealOrder mealOrder) {
        mealOrder.prepareOrder();
    }
}
