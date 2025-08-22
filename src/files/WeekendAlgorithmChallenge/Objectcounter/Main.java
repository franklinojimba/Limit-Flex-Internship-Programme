package files.WeekendAlgorithmChallenge.Objectcounter;

class Counter{
    private static int objectCount = 0;

    public Counter() {
        objectCount++;
    }
    public static int getCount() {
        return objectCount;
    }
}
public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        System.out.println("Object Count: " + Counter.getCount());

    }
}
