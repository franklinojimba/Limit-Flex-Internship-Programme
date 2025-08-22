package files.WeekendAlgorithmChallenge.Interfaces;
interface Flyable{
   abstract void fly();
}
interface Swimable{
    abstract void swim();
}
public class Duck implements Flyable, Swimable {
    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
