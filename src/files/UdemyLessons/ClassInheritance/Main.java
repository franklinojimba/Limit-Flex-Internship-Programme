package files.UdemyLessons.ClassInheritance;

public class Main {

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }

    public static void main() {
        Animal animal = new Animal("Generic Animal", "Huge", 400 );
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15, "Pointed", "Swimmer" );
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Retriever", 80);
        doAnimalStuff(retriever, "slow");


}}
