package files.WeekendAlgorithmChallenge.Greeting;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {

            @Override
            public void sayHello() {
                System.out.println("This is a greeting.");
            }
        };greeting.sayHello();
    }
}
