package files.WeekendAlgorithmChallenge.Casting;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog;
        animal.makeSound();//upcasting; dog is cast to animal
        if (animal instanceof Dog){
            Dog d = (Dog) animal;
            d.fetch();
            d.makeSound();
        }
    }
}
