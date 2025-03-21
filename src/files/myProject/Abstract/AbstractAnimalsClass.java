package files.myProject.Abstract;
abstract class Animal{
    public abstract void makeSound();
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Woof woof!!!!");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meeeoowww!!!!");
    }
}
public class AbstractAnimalsClass {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

    }
}
