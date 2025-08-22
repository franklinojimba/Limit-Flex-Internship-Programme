package files.WeekendAlgorithmChallenge.NestedClasses;

public class Outer {
    class Inner {
        String name;
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner inner = o.new Inner();
    }
}
