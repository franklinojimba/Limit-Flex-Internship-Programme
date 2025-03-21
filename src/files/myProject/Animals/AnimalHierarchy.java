package files.myProject.Animals;
class Animal{
    public void sounds(){
        System.out.println("Animals have different sounds");
    }
}
class Dog extends Animal {
    public void sounds(){
        System.out.println("Dogs bark");
    }
}
class Cat extends Animal {
    public void sounds(){
        System.out.println("Cats purr");
    }
}
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sounds();
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sounds();
        cat.sounds();
    }
}
